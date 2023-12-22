import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n+1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		reader.close();
		
		for (int i = 1; i <= n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + i + ": ");
			sb.append("key = " + a[i] + ", ");
			int p = i/2;
			int l = i*2;
			int r = i*2+1;
			if (p >= 1) sb.append("parent key = " + (a[p]) + ", ");
			if (l <= n) sb.append("left key = " + (a[l]) + ", ");
			if (r <= n) sb.append("right key = " + (a[r]) + ", ");
			System.out.println(sb.toString());
		}
	}
}

