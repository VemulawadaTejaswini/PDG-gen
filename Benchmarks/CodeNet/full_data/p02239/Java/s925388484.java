import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int u,k,v;
	int[][] list;
	
	int[] ans;
	int[] color;
	
	Queue<Integer> Q = new ArrayDeque<Integer>();
	
	public void input() {
		n = sc.nextInt();
		list = new int[n][n];
		ans =  new int[n];
		color = new int[n];
		Arrays.fill(color, 0);
		for(int i=0; i<n; i++) {
			u = sc.nextInt();
			k = sc.nextInt();
			while(k > 0) {
				v = sc.nextInt();
				list[u-1][v-1] = 1;
				k--;
			}
		}
	}
	
	public void bfs() {
		Q.add(0);
		while(Q.size() != 0) {
			int u = Q.poll();
			for(int i=0; i<n; i++) {
				if(list[u][i] == 1 && color[i] == 0) {
					color[i] = -1;
					ans[i] = ans[u] +1;
					Q.add(i);
				}
			}
			color[u] = 1;
		}
	}
	
	public void output() { for(int i=0; i<n; i++) { System.out.println(i+1+" "+ans[i]); } }
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.bfs();
		obj.output();
	}
}

