import java.io.*;
import java.util.StringTokenizer;

class Main {
	private static final int a[] = {0,0,0,0,0,0,0,0,0,0};
	private static final int data[][] = new int[11][331];

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		solve(0,1);

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				if (n<=10&&s<=330) System.out.println(data[n][s]);
				else System.out.println(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int solve(int s,int d) {
		if (d==10) return 0;
		else {
			for (int i=0;i<=9;i++) {
				if (a[i]==0) {
					data[d][s+i*d]++;
					a[i] = 1;
					solve(s+i*d,d+1);
					a[i] = 0;
				}
			}
			return s;
		} 
	}
}