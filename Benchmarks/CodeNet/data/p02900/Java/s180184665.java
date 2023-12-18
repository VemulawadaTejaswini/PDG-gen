import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      long n = scanner.nextLong();
      long m = scanner.nextLong();
      
      long g = GCD(n, m);
            System.out.println(g);

      int answer = 0;
      if (g >= 1) answer++;
      for (long i = 2; i <= g / i; i++) {
      	if ((g % i) == 0) {
        	answer++;
        	while ((g % i) == 0) {
            	g /= i;
            }
        }
      }
      
      System.out.println(answer);
    }
  
   private static long GCD(long a, long b) {
        if(b==0) return a; 
	return a % b == 0 ? b : GCD(b, a % b);
   }
}