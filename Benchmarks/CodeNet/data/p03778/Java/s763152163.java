import java.util.*;
// warm-up
public class Main {

	static class Pair {
		int x=0, y=0;
		Pair(int a, int b) {
			x=a; y=b;
		}
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		Pair[] r = {new Pair(a, a+w), new Pair(b, b+w)};
		if (r[0].x>r[1].y) { Pair t = r[0]; r[0]=r[1]; r[1]=t; }
		System.out.println(r[1].x-r[0].y>0 ? r[1].x-r[0].y : 0);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}