import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int MAXN = 1600;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n=cin.nextInt();
        BigInteger ans=BigInteger.ONE;
        for(int i=0;i<n;i++){
        	BigInteger tmp=cin.nextBigInteger();
        	ans=(ans.multiply(tmp)).divide(ans.gcd(tmp));
        }
        out.println(ans);
        out.flush();
        out.close();
        cin.close();
    }
}