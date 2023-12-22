import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] s = new int[100][51];
		int[][] res = new int[100][51];
		int yp = 0;

		for (int i=0;i<100;i++)	{
			Arrays.fill(s[i],-1);
			Arrays.fill(res[i],0);
		}

		try {
			s[yp++][0] = Integer.parseInt(br.readLine());

			int xp = 0;
			while (true) {
				StringTokenizer st = new StringTokenizer(br.readLine(),",");
				int count = st.countTokens();
				for (int i=0;i<count;i++) {
					s[yp][xp++] = Integer.parseInt(st.nextToken());
				}
				if (count==1) break;
				xp = 0;
				yp++;
			}

			//check_s(s,yp);

			res[0][0] = s[0][0];
			for (int i=1;i<=yp;i++) {
				for (int j=0;s[i][j]!=-1;j++) {
					if (i<=(yp/2)) {
						if (j==0) {
							res[i][j] = res[i-1][j]+s[i][j];
						} else if (s[i-1][j]==-1) {
							res[i][j] = res[i-1][j-1]+s[i][j];
						} else {
							int t1 = res[i-1][j]+s[i][j];
							int t2 = res[i-1][j-1]+s[i][j];
							if (t1>t2) res[i][j] = t1;
							else res[i][j] = t2;
						}
					} else {
						int t1 = res[i-1][j]+s[i][j];
						int t2 = res[i-1][j+1]+s[i][j];
						if (t1>t2) res[i][j] = t1;
						else res[i][j] = t2;
					}
				}
			}
			System.out.println(res[yp][0]);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void check_s(int[][] s,int yp) {
		for (int i=0;i<=yp;i++) {
			int j = 0;
			while (s[i][j]!=-1) System.out.print(s[i][j++]);
			System.out.println();
		}
	}
}