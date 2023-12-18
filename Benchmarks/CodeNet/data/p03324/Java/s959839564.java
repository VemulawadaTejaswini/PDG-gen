import java.util.*;
// Word by word ripped from editorial solution. 
// Completes first 100th incomplete atcoder ABC submission. 
// Atcoder is awesome.. 
public class Main {

	static int calc(int x) {
		int ret = 0;
		while (x%100==0) {
			x/=100;
			++ret;
		}
		return ret;
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(), N = sc.nextInt(), cnt=0, val=0;
		while (cnt<N) {
			++val;
			if (calc(val)==D) ++cnt;
		}
		System.out.println(val);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}