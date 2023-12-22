import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int v[][] = new int[n][];
		
		for (int i = 0; i < n; i ++) {
			int u = scanner.nextInt() - 1;
			int k = scanner.nextInt();
			
			v[u] = new int[k];
			
			for (int j = 0; j < k; j ++) {
				v[u][j] = scanner.nextInt() - 1;
			}
		}

		scanner.close();
		
		Stack<Integer> stack = new Stack<>();
		int t = 0;
		int d[] = new int[n];
		int f[] = new int[n];
		int i[] = new int[n];
		
		for (int j = 0; j < n; j ++) {
			stack.push(j);
			
			while(!stack.empty()) {
				int u = stack.peek();
				
				if (d[u] == 0) d[u] = ++ t;
				
				if (i[u] >= v[u].length) {
					stack.pop();
					if(f[u] == 0) f[u] = ++ t;
					continue;
				}
				
				if (d[v[u][i[u]]] == 0) stack.push(v[u][i[u]]);
				i[u] ++;
			}
		}
		
		for (int j = 0; j < n; j ++) {
			System.out.println((j + 1) + " " + d[j] + " " + f[j]);
		}
	}
} 

