
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static long[] list;
	public static List<Pair> info = new ArrayList<>();
	public static boolean ans = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		list = new long[n];
		for(int i = 0; i < n; i++)
			list[i] = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			long d = sc.nextLong();
			info.add(new Pair(l, r, d));
			info.add(new Pair(r, l, -d));
		}
		for(int i = 0; i < n; i++) {
			if(list[i] == Integer.MAX_VALUE) {
				list[i] = 0;
				Calc(i);
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void Calc(int n) {
		for(Pair e : info) {
			if(e.getL() == n) {
				if(list[e.getR()] == Integer.MAX_VALUE) {
					list[e.getR()] = list[e.getL()] + e.getD();
					Calc(e.getR());
				} else {
					if(list[e.getR()] == list[e.getL()] + e.getD()) {
						ans = false;
						break;
					}
				}
			}
		}
	}

}

class Pair {
	int l;
	int r;
	long d;

	protected Pair(int l, int r, long d) {
		super();
		this.l = l;
		this.r = r;
		this.d = d;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public long getD() {
		return d;
	}

	public void setD(long d) {
		this.d = d;
	}

}