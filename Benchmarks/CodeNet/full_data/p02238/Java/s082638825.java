import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[n+1][n+2];
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			for(int j = 2; j < str.length; j++){
				//a[u][0] = number of visited nodes 
				a[u][j-1] = Integer.parseInt(str[j]);
			}
		}
		
		int[] d = new int[n+1];
		int[] f = new int[n+1];
		int t = 0; // time
		int[] st = new int [n]; // stack
		int p = 0; // stack pointer
		
		for(int i = 1; i <= n; i++){
			if(d[i] != 0){
				continue;
			}
			p = 0;
			st[p] = i; // first node
			
			while(p >= 0){
				int pn = st[p]; // present node
				if(d[pn] == 0){
					t += 1;
					d[pn] = t;
				}
				// nn?????°???????
				int nn;
				do{
					// increase visited num
					a[pn][0] += 1;
					nn = a[pn][a[pn][0]];
				}while(d[nn] != 0);
				
				if(nn != 0){
					// the present node has unvisited adjacent node(s)
					// push the next node to the stack
					p += 1;
					st[p] = nn;
				}else if(f[pn] == 0){
					// does not have
					// write finish time
					t += 1;
					f[pn] = t;
					// pop from the stack
					p -= 1;
				}else{
					p -= 1;
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			sb.append(i + " " + d[i] + " " + f[i] + "\n");
		}
		System.out.print(sb);
	}

}