import java.util.*;

 // Compiler version JDK 11.0.2

  public class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner sc = new Scanner(System.in);
    System.out.println("enter the number coin");
    long x = sc.nextLong();
    long p=0;
    long sum=0;
    
   
     while (x>5)
     {
       
     
    
     if (x>=500)
     {
       p=x/500;
       sum = sum+(p*1000);
       x=x%500;
     }
     
     else if(x<500 && x >=100)
     {
       p=x /100;
       sum = sum+(p*20*5);
       x=x%100;
     }
     else if (x<100 && x>=50)
     {
       p=x/50;
       sum=sum+(p*10*5);
       x=x%50;
     }
     else if(x<50 && x>=10)
     {
       
       p=x/10;
       sum=sum+(p*2*5);
       x=x%10;
     }
     else if (x<10 && x>=5)
     sum= sum +5;
     }
     
     System.out.println(sum);
   }
   
   
   
   
 }