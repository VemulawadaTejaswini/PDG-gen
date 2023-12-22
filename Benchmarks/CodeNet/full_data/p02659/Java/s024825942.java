import java.io.*;
import java.util.*;
public class Main
{   
    public static void main(String args[])throws IOException
    {
       Scanner sc=new Scanner(System.in);
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double p=a*b;  
       System.out.println((long)Math.floor(p));    
     }
}
 