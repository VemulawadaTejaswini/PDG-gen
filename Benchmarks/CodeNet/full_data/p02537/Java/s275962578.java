import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] highes = new int[n + 1];
		int[] lowes = new int[n + 1];
		int max = 0;
		highes[0] = Integer.MAX_VALUE / 10;
		lowes[0] = Integer.MIN_VALUE / 10;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    for (int j = max; j >= 0; j--) {
		        if (highes[j] + k >= x && lowes[j] - k <= x) {
		            if (j == max) {
		                highes[j + 1] = x;
		                lowes[j + 1] = x;
		                max++;
		            } else {
		                highes[j + 1] = Math.max(highes[j + 1], x);
		                lowes[j + 1] = Math.max(lowes[j + 1], x);
		            }
		            break;
		        }
		    }
		}
		System.out.println(max);
	}
}
