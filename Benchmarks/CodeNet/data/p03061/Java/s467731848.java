import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) 
   {
     a[i]= sc.nextInt();
   }
   
   int[] forans = new int[N];
   int tmp =0;
   for(int i=0;i<N;i++)
   {
     tmp=a[0];
     for(int k=0;k<i;k++)
     {         
        tmp = gcd(tmp,a[k]);
     }
     for(int k=i+1;k<N;k++)
     {
        tmp = gcd(tmp,a[k]);
     }
     forans[i]=tmp;
   }
   Arrays.sort(forans);
   
   System.out.println(forans[N-1]);  
 }
   static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}