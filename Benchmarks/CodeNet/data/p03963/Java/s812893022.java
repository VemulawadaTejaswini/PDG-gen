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
        //a=cin.nextBigInteger();
        //b=cin.nextBigInteger();
        c=BigInteger.ONE ;
        b=BigInteger.ONE ;
        a=BigInteger.ZERO;
        BigInteger[] jc = new BigInteger[2008];
        jc[0]=c;
        if(n==1)System.out.println(k);
        else
        {
            for( i=1; i<=t; i++)jc[i]=jc[i-1].multiply(BigInteger.valueOf(i));
            for(i=2; i<=k; i++)
            {
                BigInteger cj,l;//从k选i
                l=jc[i].multiply(jc[k-i]);
                cj=jc[k].divide(l);
                BigInteger z,v;
                v=BigInteger.valueOf(i-1);

                z=v.pow(n-1);
                BigInteger p=(BigInteger.valueOf(i)).multiply(z);
                BigInteger r=cj.multiply(p);
                a=a.add(r);
            }
            System.out.println(a);
        }
    }
}