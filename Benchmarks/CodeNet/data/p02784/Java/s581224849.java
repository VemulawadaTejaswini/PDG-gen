package com.company;
import java.util.*;

public class Main {
    public static void  main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int a,b,j;
        a=s1.nextInt();
        int i=s1.nextInt();
        int[] ar=new int[i];
        int sum=0;
        for(j=0;j<i;j++)
        {
            ar[j]=s1.nextInt();
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
