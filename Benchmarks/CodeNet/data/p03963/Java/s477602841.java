import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n,i=1,x,t=1008,k;
        BigInteger a,b,c;
        n=cin.nextInt();
        k=cin.nextInt();
        c=BigInteger.ONE ;
        b=BigInteger.ONE ;
        a=BigInteger.ZERO;
        b=BigInteger.valueOf(k-1);
        c=b.pow(n-1);
        b=b.add(a);
        a=b.multiply(c);
            System.out.println(a);
        }
    }
}