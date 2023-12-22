import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int cost[][] = new int[m][m];
				int time[][] = new int[m][m];
				int min[] = new int[m];
				for (int i=0;i<m;i++) {
					Arrays.fill(cost[i],-1);
					Arrays.fill(time[i],-1);
				}
				for (int i=0;i<n;i++) {
					st = new StringTokenizer(br.readLine());
					int a = Integer.parseInt(st.nextToken())-1;
					int b = Integer.parseInt(st.nextToken())-1;
					cost[a][b] = Integer.parseInt(st.nextToken());
					cost[b][a] = cost[a][b];
					time[a][b] = Integer.parseInt(st.nextToken());
					time[b][a] = time[a][b];
				}

				n = Integer.parseInt(br.readLine());
				for (int i=0;i<n;i++) {
					st = new StringTokenizer(br.readLine());
					int p = Integer.parseInt(st.nextToken())-1;
					int q = Integer.parseInt(st.nextToken())-1;
					int r = Integer.parseInt(st.nextToken());
					if (r==0) System.out.println(search_minimum_cost(cost,p,q,m));
					else System.out.println(search_minimum_time(time,p,q,m));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int search_minimum_cost(int[][] org,int s,int g,int m) {
		int min[] = new int[m];
		int list[] = new int[m];
		int check[] = new int[m];
		int c[][] = new int[m][m];
		int lp = 0;
		int fp = 0;
		Arrays.fill(min,-1);
		Arrays.fill(check,0);
		copy(org,c,m);

		min[s] = 0;
		list[fp++] = s;
		while (fp!=lp) {
			int pt = list[lp++];
			for (int i=0;i<m;i++) {
				if (c[pt][i]>0) {
					if (check[i]==0) {
						list[fp++] = i;
						check[i] = 1;
					}
					if (min[i]==-1) {
						min[i] = min[pt]+c[pt][i];
						c[i][pt] = -1;
					} else if (min[i]>min[pt]+c[pt][i]) {
						min[i] = min[pt]+c[pt][i];
						c[i][pt] = -1;
					}
				}
			}
		}
		return min[g];
	}

	public static int search_minimum_time(int[][] org,int s,int g,int m) {
		int min[] = new int[m];
		int list[] = new int[m];
		int check[] = new int[m];
		int t[][] = new int[m][m];
		int lp = 0;
		int fp = 0;
		Arrays.fill(min,-1);
		Arrays.fill(check,0);
		copy(org,t,m);

		min[s] = 0;
		list[fp++] = s;
		while (fp!=lp) {
			int pt = list[lp++];
			for (int i=0;i<m;i++) {
				if (t[pt][i]>0) {
					if (check[i]==0) {
						list[fp++] = i;
						check[i] = 1;
					}
					if (min[i]==-1) {
						min[i] = min[pt]+t[pt][i];
						t[i][pt] = -1;
					} else if (min[i]>min[pt]+t[pt][i]) {
						min[i] = min[pt]+t[pt][i];
						t[i][pt] = -1;
					}
				}
			}
		}
		return min[g];
	}

	public static void copy(int[][] a,int[][] b,int m) {
		for (int i=0;i<m;i++) {
			for (int j=0;j<m;j++) b[i][j] = a[i][j];
		}
	}
}