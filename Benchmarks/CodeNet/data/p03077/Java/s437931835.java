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
		long min = Mod;
		for(int i=0;i<5;i++) {
			m[i]=Long.parseLong(sc.next());
			if(m[i]<min)min=m[i];
		}
		sc.close();

		long res = 0;
		if(min<n) {
			res = n/min;
		}
		res+=5;
		if(res > Mod) {
			while(res>Mod*100)res-=Mod*100;
			while(res>Mod)res-=Mod;
		}
		System.out.println(res);
	}

}