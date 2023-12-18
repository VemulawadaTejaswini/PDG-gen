import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[3 * N];
		for (int i = 0; i < 3 * N; i++)
			a[i] = sc.nextLong();
		Arrays.sort(a);
		int ind = 0;
		long ans = 0;
		for (int i = 3 * N; i - 2 > ind; i -= 2) {
			ans += a[i - 2];
			ind++;
		}
		System.out.println(ans);
	}
}