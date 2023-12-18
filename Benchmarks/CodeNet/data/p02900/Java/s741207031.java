import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = 1;
        gcd = GCD(A,B,gcd);
        ArrayList<Long> List = new ArrayList<Long>();
        for(long i=2;i<=gcd;i++)if(A%i==0&&B%i==0) List.add(i);
        int opt=0;
        for(int i=0;i<List.size();i++){
            for(int j=i+1;j<List.size();){
             if(List.get(j)%List.get(i)==0) List.remove(j);
             else j++;
            }
        }
        opt+=List.size()+1;
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