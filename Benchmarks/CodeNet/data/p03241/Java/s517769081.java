import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   
   int d = M/N;
   int ans =0;
   for(int i=Math.sqrt(M);i>=1;i++)
   {
     if(M%i==0&&i<=d)
     {
       ans =i;
       break;
     }
   }
   System.out.println(ans);   
 }
}