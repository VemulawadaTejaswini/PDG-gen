import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int[][] l;
	public static int[] d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// input & init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		l = new int[n+1][n+2];
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			for(int j = 1; j < str.length; j++){
				l[u][j-1] = Integer.parseInt(str[j]);
			}
		}

		d = new int[n+1];
		for(int i = 1; i <= n; i++){
			d[i] = -1;
		}
		
		// search
		int[] q = new int[n*n]; //queue
		int ps = 0; // start pointer
		int pe = 1; // end pointer
		q[0] = 1; // enqueue id 1
		
		while(ps != pe){
			// dequeue
			int id = q[ps];
			ps += 1;
			if(d[id] == -1){
				d[id] += 1;
			}

			// enqueue the adjacent nodes
			for(int i = 1; i <= l[id][0]; ++i){
				if(d[l[id][i]] == -1){
					q[pe] = l[id][i];
					pe += 1;
					d[l[id][i]] = d[id] + 1;
				}
			}
		}
		
		// print
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			sb.append(i + " " + d[i] + "\n");
		}
		System.out.print(sb);
	
	}
	
}