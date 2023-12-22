import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		int count = 1;

		try {
			while (true) {
				buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (a==0 && b==0) break;
				else if (a<b) System.out.println(a+" "+b);
				else System.out.println(b+" "+a);
			}
		} catch (Exception e) {
			//Exception
		}
	}
}