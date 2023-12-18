import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] data = new int[N+1][N+1];
		int[][] edge = new int[M][2];
		for(int i = 0 ; i<M; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			data[l][r] = 1;
			data[r][l] = 1;
			edge[i][0] = l;
			edge[i][1] = r;
		}
		int res = 0;
		for(int i = 0; i<M; i++) {
			int[][] clone = new int[N+1][N+1];
			for(int cr = 1; cr<=N; cr++) {
				for(int cc = 1; cc<=N; cc++) {
					clone[cr][cc] = data[cr][cc];
				}
			}
	//		int[][] test = Arrays.copyOf(data, N*M);
			int l = edge[i][0];
			int r = edge[i][1];
			clone[l][r] = 0;
			clone[r][l] = 0;
	/*		for(int t = 1; t<=N; t++) {
				System.out.println(Arrays.toString(clone[t]));
			}*/
			Set visited = new TreeSet();
			Queue wait = new LinkedList();
			wait.add(1);
			visited.add(1);
			while(!wait.isEmpty()) {
				int row = (int)wait.poll();
				for(int j = 1; j<=N; j++) {
					if(clone[row][j] == 1) {
						if(!visited.contains(j)) {
							visited.add(j);
							wait.add(j);
						}
					}
				}
			}
		//	System.out.print("size = "+visited.size());
			if(visited.size()<N) {
				res++;
		//		System.out.println("  true");
			}
	/*		else {
				System.out.println("   l "+ l +" r "+r+" false");
			}*/
		}
		System.out.println(res);
	}
}
