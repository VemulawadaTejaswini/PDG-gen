package com.company;
import java.util.*;

public class Main{
    public static void  main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        double a,b;
        int j;
        a=s1.nextDouble();
        int i=s1.nextInt();
        double[] ar=new double[i];
        double sum;
        sum=0;
        for(j=0;j<i;j++)
        {
            ar[j]=s1.nextDouble();
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
