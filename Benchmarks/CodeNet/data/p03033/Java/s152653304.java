
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long Q = sc.nextLong();
		List<Kouji> kouji = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			kouji.add(new Kouji(sc.nextLong(), sc.nextLong(), sc.nextLong()));
		}
		kouji.sort(Comparator.comparing(Kouji::getX));
		for(int i = 0; i < Q; i++) {
			long D = sc.nextLong();
			long dis = 0;
			boolean stop = false;
			for(Kouji kou : kouji) {
				if(kou.getTime(D)) {
					dis = kou.getX();
					stop = true;
					break;
				}
			}
			kouji.removeIf(o1 -> D > o1.getT() - o1.getX());
			if(!stop) {
				dis = -1;
			}
			System.out.println(dis);
		}
	}

}

class Kouji {
	private long S;
	private long T;
	private long X;
	private long L;
	private long R;

	protected Kouji(long s, long t, long x) {
		super();
		S = s;
		T = t;
		X = x;
		L = S - X;
		R = T - X;
	}

	public boolean getTime(long d) {
		boolean ans = false;
		if(L <= d && d < R) {
			ans = true;
		}
		return ans;
	}

	public long getS() {
		return S;
	}

	public void setS(long s) {
		S = s;
	}

	public long getT() {
		return T;
	}

	public void setT(long t) {
		T = t;
	}

	public long getX() {
		return X;
	}

	public void setX(long x) {
		X = x;
	}

}