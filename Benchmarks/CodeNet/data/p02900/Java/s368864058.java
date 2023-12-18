import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong();
   long B = sc.nextLong();
   long ans = 0;
   long N ;
   if(A>B) N = A;
   else N = B;
   
   boolean flg = false;
   for(int k = 1;k<=Math.sqrt(N);k++)
   {
     flg = true;
     if(A%k==0&&B%k==0) 
     {
       for(int i = 2;i<=Math.sqrt(k);i++)
       {
         if(k%i==0) 
         {
           flg = false;
           break;
         }
       }
       if(flg) ans++;
     }
   }
  System.out.println(ans);
 }
}