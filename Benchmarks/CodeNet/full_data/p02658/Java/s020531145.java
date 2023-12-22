import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Scanner;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,i;
        BigInteger a,b,ans=new BigInteger("1");
        b=new BigInteger("1000000000000000000");
        t=sc.nextInt();
        boolean ok=true;
        while(t-->0){
            a=sc.nextBigInteger();
            ans=ans.multiply(a);
            if(ans.compareTo(b)==1){
                break;
            }
        }
        a=new BigInteger("0");
        if(ans.compareTo(a)==0) System.out.println("0");
        else if(ans.compareTo(b)==1) System.out.println("-1");
        else System.out.println(ans);
    }
}