import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      
      int g = GCD(n, m);
      
      int answer = 0;
      if (g > 1) answer++;
      for (int i = 2; i <= g; i++) {
      	if ((g % i) == 0) {
        	answer++;
        	while ((g % i) == 0) {
            	g /= i;
            }
        }
      }
      
      System.out.println(answer);
    }
  
   private static int GCD(int a, int b) {
        if(b==0) return a; 
	return a % b == 0 ? b : GCD(b, a % b);
   }
}