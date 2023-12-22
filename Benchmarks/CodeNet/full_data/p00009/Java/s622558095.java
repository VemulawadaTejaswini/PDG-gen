import java.util.*;
import java.io.*;

public class Main {
	private static void solve() throws Exception {
		// final long MAX = 999999;

		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileReader("a.in"));
		PrintWriter pw = new PrintWriter(System.out, true);

		while(sc.hasNext()) {
			int i = 2;
			int n = sc.nextInt();
			boolean bool[] = new boolean[n+1];
			
			while(i<=n) {
				int k = 2;
				int c = i*k++;
				while(!bool[i] && c<=n) {
					bool[c] = true;
					c=i*k++;
				}
				i++;
			}

			long counter=0;
			for(int z=2; z<=n; z++) {
				if(!bool[z]) counter++;
			}

			System.out.println(counter);
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().solve();
	}

	static void debug (Object...a) {
		System.out.println(Arrays.deepToString(a));
	}
}