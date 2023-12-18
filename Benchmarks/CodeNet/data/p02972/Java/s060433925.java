import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] numbers = new boolean[n + 1];
		boolean[] counts = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
		    numbers[i] = (sc.nextInt() == 1);
		}
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		int count = 0;
		for (int i = n; i > 0; i--) {
		    if (numbers[i]) {
		        if (!first) {
		            sb.append(" ");
		        }
		        first = false;
		        count++;
		        sb.append(i);
		        for (int j = 1; j <= Math.sqrt(i); j++) {
		            if (i % j == 0) {
		                numbers[j] ^= true;
		                if (j * j != i) {
		                    numbers[i / j] ^= true;
		                }
		            }
		        }
		    }
		}
		System.out.println(count);
		if (count != 0) {
		    System.out.println(sb);
		}
   }
}
