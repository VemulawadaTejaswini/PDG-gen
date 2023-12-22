import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int a = sc.nextInt();
			final int s = sc.nextInt();
			final int g = sc.nextInt();
			
			if(n == 0 && a == 0 && s == 0 && g == 0){
				break;
			}
			
			String[][] adj = new String[n][n];
			
			for(int i = 0; i < a; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				
				final String lab = sc.next();
				
				if(adj[x][y] == null || lab.compareTo(adj[x][y]) < 0){
					adj[x][y] = lab;
				}
			}
			
			String[] optimal  = new String[n];
			String[] next_opt = new String[n];
			optimal[s] = "";
			
			String answer = null;
			
			boolean over = false;
			for(int t = 0; t < 4 * n; t++){
				
				for(int i = 0; i < n; i++){
					next_opt[i] = null;
				}
				
				for(int node = 0; node < n; node++){
					for(int to = 0; to < n; to++){
						if(adj[node][to] == null){
							continue;
						}else if(optimal[node] == null){
							continue;
						}
						
						String next = optimal[node].concat(adj[node][to]);
						
						//System.out.println(next + " " + optimal[to] + " " + (optimal[to] == null ? -1 : next.compareTo(optimal[to])));
						
						if(next_opt[to] == null || next_opt[to].equals("") || next.compareTo(next_opt[to]) < 0){
							next_opt[to] = next;
						}
					}
				}
				
				//System.out.println("prev: " + Arrays.toString(optimal));
				//System.out.println("cur : " + Arrays.toString(next_opt));
				
				boolean updated = false;
				if(next_opt[g] != null && !next_opt[g].equals("")){
					if(answer == null){
						answer = next_opt[g];
						updated = true;
					}else if(next_opt[g].compareTo(answer) < 0){
						answer = next_opt[g];
						updated = true;
					}
				}
				
				if(t > n && updated){
					over = true;
					break;
				}
				
				String[] tmp = next_opt;
				next_opt = optimal;
				optimal = tmp;
			}
			
			//System.out.println(Arrays.toString(optimal));
			//System.out.println(Arrays.toString(next_opt));
			
			
			if(over || answer == null || answer.equals("")){
				System.out.println("NO");
			}else{
				System.out.println(answer);
			}
		}
	}

}