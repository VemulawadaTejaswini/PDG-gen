import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   String A = sc.next();
 
   StringBuilder ans ="";
   for(int i= 0;i<B;i+=2)
   {
     ans+= A.substring(i,i+1);
   }
 
   System.out.println(ans.toString());
 }
}