

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        int cnt=0;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=b;j++){
                int sum = i*500+j*

package main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        int cnt=0;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=b;j++){
                int sum = i*500+j*100;
                if(sum==x)cnt++;
                else if(x>sum&&(x-sum)%50==0&&(x-sum)/50<=c)cnt++;
            }
        }
        
        System.out.println(cnt);
        
    }
}100;
                if(sum==x)cnt++;
                else if(x>sum&&(x-sum)%50==0&&(x-sum)/50<=c)cnt++;
            }
        }
        
        System.out.println(cnt);
        
    }
}