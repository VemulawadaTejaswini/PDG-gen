import java.util.*;
public class shubh{
  
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   int b=s.nextInt();
   int c=s.nextInt();
   
   int temp=c;
     c=b;
     b=a;
    a=temp;
   System.out.println(a+" "+b+" "+c);
   
   
 }
   
}
