import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = 1;
        gcd = GCD(A,B,gcd);
        ArrayList<Long> set = new ArrayList<>();
        for(long i=2;i<=gcd;i++){
            if(A%i==0&&B%i==0){
                boolean check = true;
                for(int j=0;j<set.size();j++)if(i%set.get(j)==0){
                    check=false;
                    break;
                }
                if(check) set.add(i);
            }
        }
        System.out.println(set.size()+1);
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