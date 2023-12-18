import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), i = 0, j = N-1, t = 0;
		int[] a = new int[N];
		while (N-->0) a[i++] = sc.nextInt();
		Arrays.sort(a);
		while (K-->0) t+=a[j--];
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}