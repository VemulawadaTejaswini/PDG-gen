import java.lang.*;
import java.math.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int h[] = new int[n];
        int min=0;
        for (int i = 0; i < n; i++)
        {
            h[i]=sc.nextInt();
        }
        int a[]=new int[n];
        a[0]=0;
        a[1]=Math.abs(h[1]-h[0]);
        for(int i=2;i<n;i++)
        {
            min=100000;
            for(int j=1;j<=k ;j++)
            {if(i-j<0)
                break;
            min=Math.min(min,a[i-j]+Math.abs(h[i-j]-h[i]));
           }
            a[i]=min;
            
        }
        System.out.println(a[n-1]);
    }
}