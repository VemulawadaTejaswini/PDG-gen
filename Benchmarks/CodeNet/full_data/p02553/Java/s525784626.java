import java.util.*;

 // Compiler version JDK 11.0.2

 public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    
    
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    int d=sc.nextInt();
    int x=0,y=0;
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
