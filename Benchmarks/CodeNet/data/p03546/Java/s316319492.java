import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] costs = new int[10][10];
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        costs[i][j] = sc.nextInt();
		    }
		}
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        for (int k = 0; k < 10; k++) {
		            costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
		        }
		    }
		}
		long total = 0;
		for (int i = 0; i < h * w; i++) {
		    int x = sc.nextInt();
		    if (x == -1) {
		        continue;
		    }
		    total += costs[x][1];
		}
		System.out.println(total);
    }
}

