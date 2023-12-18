import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      long n = scanner.nextLong();
      long m = scanner.nextLong();
      
      long g = GCD(n, m);

      int answer = 0;
      if (g >= 1) answer++;
      long limit = g / 2;
      for (long i = 2; i <= limit; i++) {
      	if ((g % i) == 0) {
        	answer++;
        	while ((g % i) == 0) {
            	g /= i;
            }
          
        } else {
          limit = g / (i + 1);
        }
      }
      
      System.out.println(answer);
    }
  
   private static long GCD(long a, long b) {
        if(b==0) return a; 
	return a % b == 0 ? b : GCD(b, a % b);
   }
}