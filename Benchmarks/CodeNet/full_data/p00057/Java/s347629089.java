import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				int S = 1;
				for (int i=1;i<=n;i++) {
					S += i;
				}
				System.out.println((long)S);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}