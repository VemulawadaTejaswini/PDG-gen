import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] sorted = (int[])(arr.clone());
		Arrays.sort(sorted);
		int base = sorted[n / 2];
		int bef = sorted[n / 2 - 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (arr[i] >= base) {
		        sb.append(bef);
		    } else {
		        sb.append(base);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
