import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] b = new int[N];
   for(int i=0;i<N;i++) b[i] = sc.nextInt();
   int ans = 0; 
   boolean plus = 0;
   for(int i =0; i<N;i++)
   {
     plus = true;
     for(int j =0;j<i;j++)
     {
       if(b[j]<b[i])
       {
         plus = false;
         break;
       }
     }
     if(plus) ans++;
   }
   System.out.println(ans);
 }
}