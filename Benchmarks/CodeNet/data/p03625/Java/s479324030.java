import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();

   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i] =sc.nextInt();
   Arrays.sort(a);
   
   int count =0;
   int tmp =a[0];
   boolean flg = false;
   int[] ans = new int[N];
   for(int i=1;i<N;i++)
   {
     if(tmp==a[i])
     {
       count++;
     }
     else
     {
       tmp = a[i];
       count=0;
     }
     if(count==1)
     {
       ans[i]= tmp;
       count =-1;
     }            
   }
   
   Arrays.sort(ans);
   long answer = (long)ans[N-1]*(long)ans[N-2];
   System.out.println(answer);
 }
}