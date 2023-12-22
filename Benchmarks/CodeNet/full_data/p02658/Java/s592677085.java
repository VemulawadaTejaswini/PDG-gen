import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger N=new BigInteger("1000000000000000000");
        BigInteger ans=new BigInteger("1");

        for(int i=1;i<=n;++i){
            BigInteger x=sc.nextBigInteger();
            ans=ans.multiply(x);
        }
        if(ans.compareTo(N)>0) System.out.println("-1");
        else System.out.println(ans);
    }
}
