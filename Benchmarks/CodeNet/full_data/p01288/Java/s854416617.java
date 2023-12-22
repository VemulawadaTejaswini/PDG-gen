import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		new Main().run();
	}
	
	private static final int MAX_N = 100000;
	private static final int MAX_Q = 100000;
	
	private int n;
	private int q;
	
	private final int[] p = new int[MAX_N - 1];
	private final boolean[] isQuery = new boolean[MAX_Q];
	private final int[] v = new int[MAX_Q];
	
	private final int[] marked = new int[MAX_N];
	private final int[] parent = new int[MAX_N];
	
	private void run() {
		
		while(((n = IN.nextInt()) | (q = IN.nextInt())) != 0) {
			
			for (int i = 0; i < n - 1; i ++) {
				
				p[i] = IN.nextInt() - 1;
			}
			Arrays.fill(marked, 0, n, - 1);
			marked[0] = - 2;
			for (int i = 0; i < q; i ++) {
				
				isQuery[i] = IN.next().charAt(0) == 'Q';
				v[i] = IN.nextInt() - 1;
				if(!isQuery[i] && marked[v[i]] == - 1) {
					
					marked[v[i]] = i;
				}
			}
			
			for (int i = 0; i < n; i ++) {
				
				if (marked[i] == - 1) {
					
					parent[i] = p[i - 1];
					
				} else {
					
					parent[i] = i;
				}
			}
			
			long summation = 0;
			for (int i = q - 1; i >= 0; i --) {
				
				if (isQuery[i]) {
					
					summation += find(v[i]) + 1;
					
				} else if (marked[v[i]] == i) {
					
					union(v[i], p[v[i] - 1]);
				}
			}
			System.out.println(summation);
		}
	}
	
	private static final Scanner IN = new Scanner(System.in);
	
	private int find(int x) {
		
		if (parent[x] == x) {
			
			return x;
			
		} else {
			
			return parent[x] = find(parent[x]);
		}
	}
	
	private void union(int x, int y) {
		
		y = find(y);
		parent[x] = y;
	}
}