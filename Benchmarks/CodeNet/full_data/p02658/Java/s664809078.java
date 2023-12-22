import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
           int n=sc.nextInt();
           long a[]=new long[n];
           boolean check1=false;
           for( int i=0;i<n;i++)
           {
               a[i]=sc.nextLong();
               if(a[i]==0)
               check1=true;
           }
           
           long ans=1;
           boolean check=true;
           for( int i=0;i<n;i++)
           {
               ans*=a[i];
               if(ans<0||ans>1000000000000000000l)
               {
                   check=false;
               }
           }
           if(check1)
           System.out.println(0);
           
           else if(check==false)
           {
               System.out.println(-1);
           }
           else
           System.out.println(ans);
        }
            
    }
   
}