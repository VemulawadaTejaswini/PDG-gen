import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   String A = sc.next();
   int B = A.length();
 
   String ans ="";
   String tmp = "";
   for(int i= 0;i<B;i+=2)
   {
     tmp = A.substring(i,i+1);
     ans += tmp;
   }
 
   System.out.println(ans);
 }
}