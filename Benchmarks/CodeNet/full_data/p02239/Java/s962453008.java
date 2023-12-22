import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int v[][] = new int[n][];
		int d[] = new int[n];
		
		for (int i = 0; i < n; i ++) {
			d[i] = -1;
			
			int u = scanner.nextInt() - 1;
			int k = scanner.nextInt();
			
			v[u] = new int[k];
			
			for (int j = 0; j < k; j ++) {
				v[u][j] = scanner.nextInt() - 1;
			}
		}

		scanner.close();
		
		Queue<Integer> queue = new ArrayDeque<>(n);
		
		d[0] = 0;
		queue.add(0);
		while(!queue.isEmpty()) {
			int u = queue.remove();
			for (int i = 0; i < v[u].length; i ++) {
				if (d[v[u][i]] == -1) {
					d[v[u][i]] = d[u] + 1;
					queue.add(v[u][i]);
				}
			}
		}
		
		for (int j = 0; j < n; j ++) {
			System.out.println((j + 1) + " " + d[j]);
		}
	}
} 

