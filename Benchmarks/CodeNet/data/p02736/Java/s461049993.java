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
        int w=sc.nextInt();
        int ar[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            ar[i]=w%10;
            w=w/10;
        }
        while(n>1)
        {
            for(int i=0;i<n-1;i++)
            {
                if(ar[i]>=ar[i+1])
                ar[i]=ar[i]-ar[i+1];
                else
                ar[i]=ar[i+1]-ar[i];
            }
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