import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int INF = Integer.MAX_VALUE/10;

		Scanner scan = new Scanner(System.in);
		while(true){
			int e=scan.nextInt();
			if(e==0)
				break;


			int[] a = new int[e];
			int[] b = new int[e];
			int[] c = new int[e];

			int v = 0;

			for(int i=0;i<e;i++){
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[i] = scan.nextInt();
				v = Math.max(a[i],b[i]);
			}
			v++;

			int[][] cost = new int[v][v];
			for(int i=0;i<v;i++)
				for(int j=0;j<v;j++)
					cost[i][j]=INF;

			for(int i=0;i<e;i++){
				cost[a[i]][b[i]] = cost[b[i]][a[i]] = c[i];
			}

			int[] sum = new int[v];

			for(int s=0;s<v;s++){	//始点はs

				int[] d = new int[v];
				for(int i=0;i<v;i++)
					d[i]=INF;
				d[s]=0;

				ArrayList<Integer> used = new ArrayList<Integer>();


				while (true) {

					int n = -1;
					for (int i = 0; i < v; i++) {
						if (!used.contains(i) && (n == -1 || d[i] < d[n]))
							n = i;
					}

					if (n == -1){
						for(int i=0;i<v;i++)
							sum[s]+=d[i];
						break;
					}

					used.add(n);
					for (int i = 0; i < v; i++) {
						d[i] = Math.min(d[i], d[n] + cost[n][i]);
					}

				}
			}

			int ans=v-1;
			for(int i=v-1;i>=0;i--)
				if(sum[ans]>=sum[i])
					ans=i;

			System.out.println(ans+" "+sum[ans]);
		}
	}

}