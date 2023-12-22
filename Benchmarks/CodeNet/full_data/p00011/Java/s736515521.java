import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			int w = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int amida[] = new int[w];
			for (int i=0;i<w;i++) amida[i] = i+1;
			for (int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(),",");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				amida[a-1] = amida[a-1]^amida[b-1];
				amida[b-1] = amida[a-1]^amida[b-1];
				amida[a-1] = amida[a-1]^amida[b-1];
			}
			for (int i=0;i<w;i++) System.out.println(amida[i]);
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}