import java.util.*;

public class Main{
            
      public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);                                                                     
           
           int N = sc.nextInt();
          
           long t[] = new long[N];

           for(int i = 0; i < N;i++){
               t[i] = sc.nextLong();
           }                      
           
           for(int i = 0 ;i < N-1;i++){
               long a = lcm(t[i],t[i+1]);  
               t[i+1] = a;
           }
           
           System.out.println(t[N-1]);
           
      }
        
      private static long gcd(long m, long n) {
           if(m < n) return gcd(n, m);
           if(n == 0) return m;
           return gcd(n, m % n);
      } 
    
      private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
      }        
        
}       