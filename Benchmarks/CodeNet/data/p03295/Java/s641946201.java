import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] arr = new int[n];
		Pair[] pairs = new Pair[m];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			pairs[i] = new Pair(Math.min(a, b), Math.max(a, b));
		}
		Arrays.sort(pairs, Comparator.comparing(Pair::getB));
		int ans = 0, last = -1;
		for(Pair p : pairs) {
			if(last <= p.a){
				ans++;
				last = p.b;
			}
		}
		System.out.println(ans);
	}
}

class Pair {
	int a, b;
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() { return this.a; }
	public int getB() { return this.b; }
}