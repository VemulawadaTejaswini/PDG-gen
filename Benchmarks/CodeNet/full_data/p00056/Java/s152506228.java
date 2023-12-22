import java.io.*;

class Main {
	private static final int M = 50000;

	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		int list[] = new int[M+1];
		int c = 0;
		for (int i=2;i<=M;i++) list[i] = 0;
		for (int i=2;i<=M;i++) {
			for (int j=2;i*j<=M;j++) {
				list[i*j] = 1;
			}
		}
		for (int i=2;i<=M;i++) {
			if (list[i]==0) c++;
		}
		int p[] = new int[c+2];
		int ptr = 0;
		for (int i=2;i<=M;i++) {
			if (list[i]==0) p[ptr++] = i;
		}

		try {
			while ((buf = br.readLine()).equals("0")==false) {
				int n = Integer.parseInt(buf);
				int count = 0;
				for (int i=0;i<=c+1;i++) {
					if (p[i]>n) break;
					for (int j=i;j<=c+1;j++) {
						if (p[i]+p[j]==n) count++;
						else if (p[j]>n) break;
					}
				}
				System.out.println(count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}