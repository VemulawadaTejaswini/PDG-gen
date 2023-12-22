import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main (String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int lim = Math.max(a,b);
				int m = 1;
				for (int i=2;i<=lim;i++) {
					if (a%i==0&&b%i==0) m = i;
				}
				System.out.println(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}