
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int v ;
	int e;
	void run() {
		v = sc.nextInt();
		e = sc.nextInt();
		
		int r[][] = new int[v][v];
		
		for(int i =0 ; i < e; i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			int rr = sc.nextInt();
			
			r[from][to] += rr;
		}
		
		long ans = 0;
		
		boolean[] visited = new boolean[v];
		int[] path = new int[v+1];
		
		for(;;){
//			System.out.println(Arrays.deepToString(r));
			
			Arrays.fill(visited, false);
			Arrays.fill(path, -1);

			visited[0] = true;
			path[0] = 0;

			int volume = dfs(10000,0,0,path,visited,r);
			if(volume == 0){
				break;
			}
			
			ans += volume;
//			System.out.println("here "+volume+" "+Arrays.toString(path));
			for(int i = 1;path[i] != -1;i++){
				int from = path[i-1];
				int to = path[i];
//				System.out.println(from+","+to+","+volume);
			
				r[from][to] -= volume;
				r[to][from] += volume;
				
			}
		}
		System.out.println(ans);
	}
	
	int dfs(int volume, int now, int count ,int[] path, boolean[] visited, int[][] r){
//		System.out.println(volume+" "+now+" "+count);
//		System.out.println(Arrays.toString(path));
		if(now == v-1){
			return volume;
		}
		for(int i = 0 ; i < v; i++){
			if(visited[i]){
				continue;
			}
			if( r[now][i] > 0 ){
				int next_volume = Math.min(volume, r[now][i]);

				visited[i] = true;
				path[count+1] = i;
				
				int x = dfs(next_volume, i, count+1,path,visited,r);
				
				if(x != 0){
					return x;
				}
				
				visited[i] = false;
				path[count+1] = -1;

			}
		}
		
		return 0;		
		
	}
}

