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
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
            b[i]=in.nextInt();
        int cnt=0;
        for(int i=n-1;i>=0;i--)
            c[cnt++]=b[i];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(a[i]==c[i])
            {
                flag=false;
               break; 
            }
        }
        if(flag==true)
        {
            System.out.println("Yes");
            for(int i=0;i<n;i++)
                System.out.print(c[i]+" ");
        }
        else
        {
            flag=true;
            int tmp=c[n/2];
            c[n/2]=c[n/2+1];
            c[n/2+1]=tmp;
            for(int i=0;i<n;i++)
            {
                if(a[i]==c[i])
                {
                    flag=false;
                break; 
                }
            }
            if(flag==true)
            {
                System.out.println("Yes");
                for(int i=0;i<n;i++)
                    System.out.print(c[i]+" ");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}