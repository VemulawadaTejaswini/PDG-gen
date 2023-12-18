import java.util.*;
 
 public class Main {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int N = sc.nextInt();
         long[] As = new long[N];
         long[] Bs = new long[N];
 
         for (int i = 0; i < N; i++) {
             As[i] = sc.nextLong();
             Bs[i] = sc.nextLong();
         }
 
         int count = 0;
         for (int i = N - 1; i >= 0; i--) {
             long a = As[i] + count;
             long b = Bs[i];
             if (a % b > 0) {
                 count += b - (a % b);
             }
         }
 
         System.out.println(count);
 	}
 }