import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i] =sc.nextInt();
   Arrays.sort(a);
   int ans = 0;
   for(int i=0;i<N-2;i++)
   {
     for(int k =i+1;k<N-1;k++)
     {
       for(int j =k+1;j<N;j++)
       {
         if(a[i]+a[k]>a[j]) ans++;
         else break;
       }
     }
   }
  System.out.println(ans);
 }
}