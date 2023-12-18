import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long[]m = new long[5];
	static long Mod = 1000_000_007;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i=0;i<5;i++)m[i]=Long.parseLong(sc.next());
		sc.close();
		Arrays.sort(m);

		long res = 0;
		if(m[0]<n) {
			res = n/m[0];
		}
		res+=5;
		System.out.println(res%Mod);
	}

}