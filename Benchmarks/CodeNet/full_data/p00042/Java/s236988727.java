import java.io.*;
import java.util.StringTokenizer;

class Main {
	private static final int NOTADD = 10000;

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
 
		try {
			int c = 1;
			while (true) {
				int W = Integer.parseInt(br.readLine());
				if (W==0) break;

				int N = Integer.parseInt(br.readLine());
				int cost[] = new int[N];
				int weight[] = new int[N];
				int csum = 0;
				for (int i=0;i<N;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(),",");
					cost[i] = Integer.parseInt(st.nextToken());
					weight[i] = Integer.parseInt(st.nextToken());
					csum += cost[i];
				}
				int T[][] = new int[N][csum+1];
				for (int i=0;i<N;i++) {
					for (int j=0;j<=csum;j++) T[i][j] = NOTADD;
				}

				T[0][0] = 0;
				T[0][cost[0]] = weight[0];
				for (int i=1;i<N;i++) {
					for (int k=0;k<=csum;k++) T[i][k] = T[i-1][k];
					for (int k=0;k<=csum;k++) {
						int l = k-cost[i];
						if (l>=0) {
							if (T[i-1][l]!=NOTADD&&T[i-1][l]+weight[i]<=Math.min(W,T[i][k])) {
								T[i][k] = T[i-1][l]+weight[i];
							} else if (T[i-1][l]==NOTADD&&T[i-1][l]+weight[i]<=W) {
								T[i][k] = T[i-1][l]+weight[i];
							}
						}
					}
				}
				int k = csum;
				while (T[N-1][k]==NOTADD) {
					if (k<=0) break;
					k--;
				}
				System.out.println("Case "+c+":");
				System.out.println(k);
				System.out.println(T[N-1][k]);
				c++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}