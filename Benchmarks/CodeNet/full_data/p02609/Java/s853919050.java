import java.lang.*;
import java.util.scanner.*;
public class task{

   public static void main(String[] args) {
scanner sc=new scanner(system.in);
     
      int n=sc.nextInt();
     int count=0;
 
      System.out.println(Integer.toBinaryString(n)); 
      System.out.println(Integer.bitCount(n)); 
     do(n--!=0){
       int remainder=Integer.toBinaryString(i)/Integer.bitCount(i);
       count++;
       while(remainder==0);
       system.out.println(count);
   } 
} 