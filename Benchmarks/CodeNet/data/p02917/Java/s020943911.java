import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = Integer.MAX_VALUE;
		long total = 0;
		for (int i = 0; i < n - 1; i++) {
		    int x = sc.nextInt();
		    total += Math.min(prev, x);
		    prev = x;
		}
		System.out.println(total + prev);
   }
}
