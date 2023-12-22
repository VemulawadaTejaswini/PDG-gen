import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				long n = Integer.parseInt(st.nextToken());
				long m = Integer.parseInt(st.nextToken());
				long gcd;
				long lcm = n*m;
				while (n%m!=0) {
					long t = m;
					m = n%m;
					n = t;
				}
				gcd = m;
				lcm = lcm/gcd;
				System.out.println(gcd+" "+lcm);
			}
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}