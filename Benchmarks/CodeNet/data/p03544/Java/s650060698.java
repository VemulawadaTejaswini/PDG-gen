import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   
   long ans = 0;
   long l1 = 2;
   long l2 = 1;
   for(int k = 1;k<N;k++)
   {
     ans = l1+l2;
     l1 = l2;
     l2 = ans;
   }
   if(N==1) System.out.println(1);
   else System.out.println(ans);
 }
}