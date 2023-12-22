//  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿>
//  ⣿         
//  ⣿ Author - midu_01
//  ⣿         
//  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿>

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Main
{
    static Scanner cin = new Scanner(System.in);
    static PrintStream cout = new PrintStream
    (new FileOutputStream(FileDescriptor.out));
    
    public static void main(String args[])
    {
        int t,n,m,a,b,c,d,e,i,j,k,x,y,z,/*cnt=0,*/cnt1=0;
        Vector<Integer> v = new Vector<>();
        boolean flag = false;
        n=cin.nextInt();
        int[] ch=new int[n];
        for(i=0;i<n;i++)
        {
            ch[i]=cin.nextInt();
        }
        long cnt=0;
        for(i=0;i<n;i++)
        {
            a=ch[i];
            for(j=i+1;j<n;j++)
            {
                b=ch[j];
                if(a==b) continue;
                for(k=j+1;k<n;k++)
                {
                    c=ch[k];

                    if(a==c || b==c) continue;
                    if(a+b<=c || a+c<=b || b+c<=a) continue;
                    cnt++;
                }
            }
        }
        cout.println(cnt);
    }
}
