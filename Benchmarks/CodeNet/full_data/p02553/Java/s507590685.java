import java.util.*;

 // Compiler version JDK 11.0.2

 public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    long a=sc.nextInt();
    
    
    long b=sc.nextInt();
    long c=sc.nextInt();
    
    long d=sc.nextInt();
    long x=0,y=0;
    if(a>b)
    x=a;
    else 
    x=b;
    if(c>d)
    y=c;
    else 
    y=d;
    System.out.println(x*y);
    
    
   }
 }
