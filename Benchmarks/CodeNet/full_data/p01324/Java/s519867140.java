import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final int MAX = 200;

	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> dict = new HashMap<String, Integer>();
		
		int[] from = new int[MAX];
		int[] to   = new int[MAX];
		int[] dist = new int[MAX];
		int[][] adj = new int[MAX][MAX];
		
		while (true) {
			final int n = sc.nextInt();

			if(n == 0){
				break;
			}
			
			dict.clear();
			
			int count = 0;
			for(int i = 0; i < n; i++){
				sc.nextInt(); //1
				
				//A
				String from_str = sc.next();
				if(!dict.containsKey(from_str)){
					dict.put(from_str, count);
					count++;
				}
				from[i] = dict.get(from_str);
				
				sc.next(); //=
				
				//^~
				dist[i]= Integer.parseInt(sc.next().split("\\^")[1]);
				
				//B
				String to_str = sc.next();
				if(!dict.containsKey(to_str)){
					dict.put(to_str, count);
					count++;
				}
				to[i] = dict.get(to_str);
			}
			
			for(int i = 0; i < count; i++){
				for(int j = 0; j < count; j++){
					adj[i][j] = i == j ? 0 : INF;
				}
			}
			
			for(int i = 0; i < n; i++){
				adj[from[i]][to[i]] =  dist[i];
				adj[to[i]][from[i]] = -dist[i];
			}
			
			for(int k = 0; k < count; k++){
				for(int i = 0; i < count; i++){
					for(int j = 0; j < count; j++){
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			/*
			for(int i = 0; i < count; i++){
				for(int j = 0; j < count; j++){
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			boolean flag = false;
			for(int i = 0; i < count; i++){
				for(int j = i + 1; j < count; j++){
					if(adj[i][j] != -adj[j][i]){
						flag = true;
						break;
					}
				}
			}
			
			System.out.println(flag ? "No" : "Yes");
		}

	}

}