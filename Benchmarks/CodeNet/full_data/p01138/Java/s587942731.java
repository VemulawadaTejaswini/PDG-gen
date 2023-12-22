import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		 while (true) {
			int n = in.nextInt();
			if (n == 0) break;

			int[] cnt = new int[24*60*60+1];

			for (int i=0; i<n; i++) {
				String[] s = in.next().split(":");
				String[] t = in.next().split(":");

				int start = Integer.parseInt(s[0])*3600 + Integer.parseInt(s[1])*60 + Integer.parseInt(s[2]);
				int end = Integer.parseInt(t[0])*3600 + Integer.parseInt(t[1])*60 + Integer.parseInt(t[2]);

				cnt[start]++;
				cnt[end]--;
			}

			int ans = cnt[0];
			for (int i=1; i<=24*60*60; i++) {
				cnt[i] += cnt[i-1];
				ans = Math.max(ans,cnt[i]);
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}