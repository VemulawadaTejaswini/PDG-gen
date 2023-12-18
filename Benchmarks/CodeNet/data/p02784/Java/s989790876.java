package com.company;
import java.util.*;

public class Main {
    public static void  main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        long a,b;
        int j;
        a=s1.nextLong();
        int i=s1.nextInt();
        long[] ar=new long[i];
        long sum=0;
        for(j=0;j<i;j++)
        {
            ar[j]=s1.nextLong();
            sum=sum+ar[j];
        }
        if(sum>=a)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
    }
}
