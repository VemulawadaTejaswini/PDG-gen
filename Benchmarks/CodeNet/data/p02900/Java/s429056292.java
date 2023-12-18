import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long gcd = 1;
        gcd = GCD(A,B,gcd);
        ArrayList<Long> List = new ArrayList<Long>();
        for(long i=1;i<=gcd;i++)if(A%i==0&&B%i==0) List.add(i);
        int opt=0;
        for(int i=0;i<List.size();i++){
            if(List.get(i)==1) opt++;
            else{
                double num = Math.sqrt(List.get(i));
                int check = 0;
                for(int j=2;j<=num;j++){
                    if(List.get(i)%j==0){
                        check=1;
                        break;
                    }
                }
                if(check==0) opt++;
            }
        }
        System.out.println(opt);
    }
    public static long GCD(long A,long B,long gcd){
        long r = A%B;
        if(r!=0){
            A = B;
            B = r;
            gcd = GCD(A,B,gcd);
        }
        else gcd = B;
        return gcd;
    }
}
