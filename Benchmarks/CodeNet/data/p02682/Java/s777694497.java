import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static long ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	// static long dp[];

	public static void main(String[] args) throws IOException {
		int t = 1;// sc.nextInt();

		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k=sc.nextInt();
			int val=Math.min(a, k);
			long ans=0;
			ans+=val;
			k-=val;
			val=Math.min(b, k);
			k-=val;
			val=Math.min(c, k);
			ans-=val;
			out.append(ans);

		}

		System.out.println(out);
	}
}