import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int u,k,v;
	int time;
	
	int[] discover;
	int[] finish;
	int[] color;
	//white=0, black=1, glay=-1
	int[][] list;
	
	public void input() {
		n = sc.nextInt();
		discover = new int[n];
		finish = new int[n];
		color = new int[n];
		list = new int[n][n];
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
	
	public void dfs() {
		for(int i=0; i<n; i++) { color[i] = 0; }
		time = 0;
		for(int i=0; i<n; i++) { if(color[i] == 0) visit(i); }
	}
	
	public void visit(int u) {
		color[u] = -1;
		discover[u] = ++time;
		for(int i=0; i<n; i++) { if(color[i] == 0 && list[u][i]==1) visit(i); }
		color[u] = 1;
		finish[u] = ++time;
	}

	public void output() { for(int i=0; i<n; i++) { System.out.println(i+1+" "+discover[i]+" "+finish[i]); } }
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.dfs();
		obj.output();
	}
}

