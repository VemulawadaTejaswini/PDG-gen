
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Pair[] P = new Pair[N];
		for(int i = 0;i < N;i++) {
			long X = scn.nextInt(), L = scn.nextInt();
			Pair p = new Pair(X-L, X+L);
			P[i] = p;
		}
		Arrays.sort(P);
		int ans = 0;
		long nowL = Integer.MIN_VALUE;
		for(int i = 0;i < N;i++) {
			if(nowL <= P[i].first) {
				ans++;
				nowL = P[i].second;
			}
		}
		System.out.println(ans);
	}

}

class Pair implements Comparable<Pair> {
	long first, second;

	public Pair(long f, long s) {
		this.first = f;
		this.second = s;
	}

	@Override
	public int compareTo(Pair o) {// Comparatorを自由記述せよ(これはfirstが小さい順, secondが小さい順)
		if (this.second < o.second) {
			return -1;
		}
		if (this.second > o.second) {
			return 1;
		}
		if (this.first < o.first) {
			return -1;
		}
		if (this.first > o.first) {
			return 1;
		}
		return 0;
	}
}
