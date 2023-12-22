import java.io.*;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				long S = 0;
				int d = Integer.parseInt(buf);
				for (int i=d;i+d<=600;i+=d) S += f(i)*d;
				System.out.println(S);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long f(int x) {
		return (long)x*x;
	}
}