import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main (String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int min[] = new int[3];
				int max[] = new int[3];
				int h[][] = new int[n][n];
				Arrays.fill(min,-1);
				Arrays.fill(max,0);
				for (int i=0;i<n;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					for (int j=0;j<n;j++) {
						h[i][j] = Integer.parseInt(st.nextToken());
					}
				}
				boolean flag = true;
				for (int i=0;i<n;i++) {
					for (int j=0;j<n;j++) {
						if (max[j]<h[i][j]) max[j] = h[i][j];
						if (min[i]==-1||min[i]>h[i][j]) min[i] = h[i][j];
					}
				}

				for (int i=0;i<n;i++) {
					for (int j=0;j<n;j++) {
						if (h[i][j]==min[i]&&h[i][j]==max[j]) {
							System.out.println(h[i][j]);
							flag = false;
						}
					}
				}
				if (flag) System.out.println(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}