import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   double[] a = new double[N];
   for(int i=0;i<N;i++) a[i] = sc.nextDouble();
   int ans = 0;
   double mos = 0;
   for(int i=0;i<K;i++) mos+= a[i];
   double tmp =mos;
 
   for(int i =1; i<N-K;i++)
   {
     tmp -= a[i-1];
     tmp += a[i+K-1];
     if(tmp > mos) 
     {
       mos = tmp;
       ans = i;
     }
   }
   double answer = 0.0;
   for(int i = ans ; i < ans+K ;i++)
   {
     answer += (1+a[i])/2;
   }
   System.out.println(answer);
 }
}