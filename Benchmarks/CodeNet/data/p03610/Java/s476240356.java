import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   String A = sc.next();
   int B = A.length();
 
   String ans ="";
   for(int i= 0;i<B;i+=2)
   {
     ans+= A.substring(i,i+1); 
     if(i%1000==0) System.gc()
   }
 
   System.out.println(ans);
 }
}