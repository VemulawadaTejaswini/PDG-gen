import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] costs = new int[n][n];
		int[] starts = new int[m];
		int[] ends = new int[m];
		int[] cArr = new int[m];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(costs[i], Integer.MAX_VALUE / 10);
		    costs[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
		    starts[i] = sc.nextInt() - 1;
		    ends[i] = sc.nextInt() - 1;
		    cArr[i] = sc.nextInt();
		    costs[starts[i]][ends[i]] = cArr[i];
		    costs[ends[i]][starts[i]] = cArr[i];
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
		        }
		    }
		}
		int count = 0;
		for (int i = 0; i < m; i++) {
		    if (costs[starts[i]][ends[i]] != cArr[i]) {
		        count++;
		    }
		}
		System.out.println(count);
   }
}


