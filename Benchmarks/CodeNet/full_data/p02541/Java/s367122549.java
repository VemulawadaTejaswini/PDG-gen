import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        int c=0;
        while(n>0 && (n&1)==0)
        {
            n/=2;
            c++;
        }
        c++;
        long p=(1<<c);
        long q=n;
        long ans=-1;
        for(int i=1;i<q;i++)
        {
            if((p*i-1)%q==0)
            {
                ans=p*i-1;
                break;
            }
            if((p*i+1)%q==0)
            {
                ans=p*i;
                break;
            }
        }
        if(ans==-1)
        {
            System.out.println(p*q-1);
        }
        else
            System.out.println(ans);
    }
}
