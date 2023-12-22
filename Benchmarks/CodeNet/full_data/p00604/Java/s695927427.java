import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				StringTokenizer st = new StringTokenizer(br.readLine());
				int p[] = new int[n];
				for (int i=0;i<n;i++) {
					p[i] = Integer.parseInt(st.nextToken());
				}
				Arrays.sort(p);
				int sum[] = {0,0};
				for (int i=0;i<n;i++) {
					sum[1] += p[i];
					sum[0] += sum[1];
				}
				System.out.println(sum[0]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}