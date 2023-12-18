import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		int n = nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for(int i=0;i<n;i++)v[i]= nextInt();
		for(int i=0;i<n;i++)c[i]= nextInt();

		int res = 0;
		for(int i=0;i<n;i++)res += v[i]>c[i]?v[i]-c[i]:0;
		System.out.println(res);
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
}