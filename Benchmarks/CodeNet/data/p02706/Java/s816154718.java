
import java.util.*;
public class Main{
 
     public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int t = sc.nextInt();
   int sum =0;
   while(t-->0){
       int b = sc.nextInt();
       sum+=b;
      
   }
  int r=0;
   if(a<sum){
       System.out.println(-1);
   }else{
    r = a-sum;
     System.out.println(r);
     }
}}