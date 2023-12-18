import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n + 1];
		Arrays.fill(arr, 1);
		boolean[] hasRed = new boolean[n + 1];
		hasRed[1] = true;
		for (int i = 0; i < m; i++) {
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    if (hasRed[from]) {
		        hasRed[to] = true;
		    }
		    arr[from]--;
		    arr[to]++;
		    if (arr[from] == 0) {
		        hasRed[from] = false;
		    }
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
		    if (hasRed[i]) {
		        count++;
		    }
		}
		System.out.println(count);
   }
}


