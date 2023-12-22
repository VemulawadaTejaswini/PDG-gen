import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      
      long ans = 0;
      for (int i = 1; i <= K; i++) {
      	ans += (i * f(i));
      }
      
      System.out.println(ans);
    }
  
  	private static long f(int num) {
      	int max = (int) Math.sqrt(num);
      	int count = 1;
 		for (int i = 2; i <= max; i++) {
        	if (num % i == 0) {
              count++;
            }
        }
      	return count;
    }
}
