import java.util.Scanner;



public class Main {
	
	int d[];
	boolean used[];
	int g[][];
	final int INF = 1 << 28;
	
	int die(int s, int e, int n){
		used = new boolean[n];
		d = new int[n];
		for(int j=0; j<n; ++j){ d[j] = INF; }
		
		d[s] = 0;
		while(true){
			int u = -1;
			for(int v=0; v<n; ++v){
				if(!used[v] && (u==-1 || d[v] < d[u])){
					u = v;
				}
			}
			if(u==-1){ break; }
			used[u] = true;
			for(int v=0; v<n; ++v){
				if(d[v] > d[u] + g[u][v]){
					d[v] = d[u] + g[u][v];
				}
			}
		}
		
		return d[e];
	}
	
	void io(){
		java.util.Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			final int n = Integer.parseInt(sc.nextLine())+1;
			g = new int[n][n];
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					g[i][j] = i==j ? 0 : INF;
				}
			}
			final int m = Integer.parseInt(sc.nextLine());
			for(int i=0; i<m; ++i){
				String str[] = sc.nextLine().split(",");
				int data[] = new int[str.length];
				for(int j=0; j<str.length; ++j){
					String str2[] = (str[j] + " ").split(" ");
					data[j] = Integer.parseInt(str2[0]);
				}
				final int a = data[0];
				final int b = data[1];
				final int c = data[2];
				final int d = data[3];
				
				g[a][b] = c;
				g[b][a] = d;
			}
			String str[] = sc.nextLine().split(",");
			int data[] = new int[str.length];
			for(int j=0; j<str.length; ++j){
				data[j] = Integer.parseInt(str[j]);
			}
			final int x1 = data[0];
			final int x2 = data[1];
			final int y1 = data[2];
			final int y2 = data[3];
			
			System.out.println(y1 - y2 - (die(x1, x2, n) + die(x2, x1, n)));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}