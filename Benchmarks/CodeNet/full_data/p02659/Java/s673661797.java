import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            long n=sc.nextLong();
        
            double d=sc.nextDouble();
           long c=(long)(d*100);
           long ans=n*c;
           String str=ans+"";
           if(str.length()<=2)
           System.out.println(0);
           else
           System.out.println(str.substring(0, str.length()-2));
        
        }
            
    }
   
}