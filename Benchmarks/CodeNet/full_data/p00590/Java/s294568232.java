import java.io.*;

class Main {
	public static final int N = 10000;

	public static void main (String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		int list[] = new int[N+1];
		list[1] = 1;
		for (int i=2;i<=N;i++) list[i] = 0;
		for (int i=2;i<=N;i++) {
			for (int j=2;i*j<=N;j++) {
				list[i*j] = 1;
			}
		}

		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				int count = 0;
				for (int i=2;i<=n;i++) {
					if (list[i]==0&&list[n-i+1]==0) count++;
				}
				System.out.println(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}