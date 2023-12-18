/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package atcoder;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        int b[]=new int[10];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();  
        }
        int count1=0;
        for(int j=1;j<=10;j++)
        {
            int count=0;
            for(int i=0;i<n;i++)
            {
               
                if(a[i]==j)
                {
                    count++;
                }
            }
            b[count1]=count;
            count1++;
        }
            
     /*   for(int i=0;i<count1;i++)
        {
            System.out.println(b[i]);
        }
*/
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<count1;j++)
            {
                b[a[i]-1]--;
                if(b[j]>1)
                {
                    sum=sum+((b[j])*(b[j]-1))/2;
                }
                 b[a[i]-1]++;
            }
            System.out.println(sum);
            
        }
    }
}
