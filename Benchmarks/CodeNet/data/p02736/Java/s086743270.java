import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
public static void main(String args[])
{
    try{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int f=0;
        while(n>=1)
        {
             f=0;
            for(int i=0;i<n-1;i++)
            {
                ar[i]=Math.abs(ar[i]-ar[i+1]);
                if(ar[i]==0)
                f++;

            }
            if(f==n-1)
            break;
            n--;
        }
        System.out.println(ar[0]);
    }
    catch(Exception e)
    {
        return;
    }
}
}
