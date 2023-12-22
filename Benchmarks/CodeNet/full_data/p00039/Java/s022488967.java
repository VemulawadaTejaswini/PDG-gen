import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int d[] = new int[100];

				for (int i=0;i<buf.length();i++) {
					switch (buf.charAt(i)) {
						case 'I': d[i] = 1; break;
						case 'V': d[i] = 5; break;
						case 'X': d[i] = 10; break;
						case 'L': d[i] = 50; break;
						case 'C': d[i] = 100; break;
						case 'D': d[i] = 500; break;
						case 'M': d[i] = 1000; break;
					}
				}

				int ans = 0;
				int l = buf.length();
				for (int i=0;i<l;i++) {
					if (d[i]<d[i+1]&&i<l-1) ans -= (d[i]<<1);
					ans += d[i];
				}
				System.out.println(ans);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}