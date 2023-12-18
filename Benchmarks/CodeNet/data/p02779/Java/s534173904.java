import java.util.*;
import java.io.*;
public class demo
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int A[] = new int[n];
       int i,j,flag=0;

       for(i=0;i<n;i++)
       {
            A[i] = sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
            for(j=i+1;j<n;j++)
            {
                if(A[i]==A[j])
                {
                    flag=1;
                }
            }
       }

       if(flag==0)
       {
            System.out.println("YES");
       }
       else
       {
            System.out.println("NO");
       }
    }
}