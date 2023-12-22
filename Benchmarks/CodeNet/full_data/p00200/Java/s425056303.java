import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;

class Main {
	public static final int VISITED = 1;
	public static final int NOT_VISITED = 0;
	public static final int NOT_LINKED = -1;
	public static final int INF = -1;

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		StringTokenizer st;
		int n,m,a,b,cost,time,k,s,t,target;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				st = new StringTokenizer(buf);

				// ???????????±?????° n
				n = Integer.parseInt(st.nextToken());
				// ?§??????° m
				m = Integer.parseInt(st.nextToken());

				int cost_map[][] = new int[m][m];
				int time_map[][] = new int[m][m];
				for (int i=0;i<m;i++) {
					Arrays.fill(cost_map[i], NOT_LINKED);
					Arrays.fill(time_map[i], NOT_LINKED);
				}

				for (int i=0;i<n;i++) {
					st = new StringTokenizer(br.readLine());
					a = Integer.parseInt(st.nextToken())-1;
					b = Integer.parseInt(st.nextToken())-1;
					cost = Integer.parseInt(st.nextToken());
					time = Integer.parseInt(st.nextToken());
					cost_map[a][b] = cost_map[b][a] = cost;
					time_map[a][b] = time_map[b][a] = time;
				}

				//printMaps(cost_map, time_map, m);

				// ????????????????????° k
				k = Integer.parseInt(br.readLine());
				for (int i=0;i<k;i++) {
					st = new StringTokenizer(br.readLine());
					s = Integer.parseInt(st.nextToken())-1;
					t = Integer.parseInt(st.nextToken())-1;
					target = Integer.parseInt(st.nextToken());
					if (target==0) System.out.println(minTarget(s, t, cost_map, m));
					if (target==1) System.out.println(minTarget(s, t, time_map, m));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void printMaps(int c[][], int t[][], int map_size) {
		System.out.println("cost:");
		for (int i=0;i<map_size;i++) {
			for (int j=0;j<map_size;j++) {
				System.out.print(String.format("%1$4d", c[i][j]));
			}
			System.out.println();
		}

		System.out.println("time:");
		for (int i=0;i<map_size;i++) {
			for (int j=0;j<map_size;j++) {
				System.out.print(String.format("%1$4d", t[i][j]));
			}
			System.out.println();
		}
	}

	public static int minTarget(int s, int t, int map[][], int map_size) {
		int check_visit[] = new int[map_size];
		int queue[] = new int[map_size];
		int min_list[] = new int[map_size];
		int p = 0, q = 0;

		Arrays.fill(check_visit, NOT_VISITED);
		Arrays.fill(min_list, INF);
		min_list[s] = 0;
		check_visit[s] = VISITED;
		queue[p++] = s;
		while (p!=q) {
			int v = queue[q++];
			for (int i=0;i<map_size;i++) {
				if (map[v][i]!=NOT_LINKED) {
					if (min_list[i]==INF||(min_list[i]>min_list[v]+map[v][i])) {
						System.out.println("v: "+v+" i: "+i);
						min_list[i] = min_list[v]+map[v][i];
					}
					if (check_visit[i]==NOT_VISITED) {
						check_visit[i] = VISITED;
						queue[p++] = i;
					}
				}
			}
		}
		//printMinlist(min_list, map_size);
		return min_list[t];
 	}

	public static void printMinlist(int list[], int s) {
		System.out.println("Minimum List:");
		for (int i=0;i<s;i++) {
			System.out.println((i+1)+": "+list[i]);
		}
	}
}