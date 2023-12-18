import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int[] a=new int[N+1];
     int[] b=new int[N];
     int ans=0,answer=0;
     for(int i=0;i<N;i++){
       b[i]=sc.nextInt();
       a[b[i]]++;
     }
     for(int i=0;i<=N;i++){
       answer += (a[i]*a[i]-a[i])/2;
     }
     for(int i=0;i<N;i++){
       ans = answer-a[b[i]]+1;
       System.out.println(ans);
     }
   }
}
