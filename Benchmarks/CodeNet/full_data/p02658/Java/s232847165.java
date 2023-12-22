import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t;
        BigInteger a,b,ans=new BigInteger("1");
        b=new BigInteger("1000000000000000000");
        t=sc.nextInt();
        while(t-->0){
            a=sc.nextBigInteger();
            ans=ans.multiply(a);
            
        }
        if(ans.compareTo(b)==1) System.out.println("-1");
        else System.out.println(ans);
    }
}
