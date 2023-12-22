import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, m, a, b;
		String[] str;
		int[][] map;
		int[] prim;
		PriorityQueue<int[]> que;
		while((n = sc.nextInt()) != 0){
			m = sc.nextInt();
			map = new int[n][n];
			for(int i = 0; i < m; i++){
				str = sc.next().split(",");
				a = Integer.parseInt(str[0]);
				b = Integer.parseInt(str[1]);
				map[a][b] = map[b][a] = Integer.parseInt(str[2]);
			}
			prim = new int[n];
			Arrays.fill(prim, -1);
			que = new PriorityQueue<int[]>(m, new Comparator<int[]>(){
				public int compare(int[] a, int[] b){
					return a[0] - b[0];
				}
			});
			for(int i = 1; i < n; i++){
				if(map[0][i] != 0){
					que.add(new int[]{map[0][i], i});
				}
			}
			int[] now;
			int sum = 0;
			prim[0] = 0;
			while(!que.isEmpty()){
				now = que.poll();
				if(prim[now[1]] == -1){
					sum += (now[0] / 100) - 1;
					prim[now[1]] = 0;
					for(int i = 0; i < n; i++){
						if(map[now[1]][i] != 0){
							que.add(new int[]{map[now[1]][i], i});
						}
					}
				}
			}
			System.out.println(sum);
		}
	}
}