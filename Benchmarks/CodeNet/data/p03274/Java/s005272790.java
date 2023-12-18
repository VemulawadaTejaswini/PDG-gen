import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		int x[] = new int[N];
		for (i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		ArrayDeque<Integer> sei = new ArrayDeque<>();
		ArrayDeque<Integer> fu = new ArrayDeque<>();
		ArrayDeque<Integer> goukei = new ArrayDeque<>();

		ArrayList<Integer> seilist = new ArrayList<Integer>();
		ArrayList<Integer> fulist = new ArrayList<Integer>();

		for (i = 0; i < N; i++) {
			if (K <= sei.size()) {
				break;
			}
			if (x[i] >= 0) { // 0は生に含める
				sei.add(x[i]);
				goukei.add(x[i]);
				seilist.add(x[i]);
			}
		}
		for (i = 0; i < N; i++) {
			if (K <= fu.size()) {
				break;
			}
			if (x[i] < 0) {
				fu.add(x[i]);
				fulist.add(x[i]);
			}
		}


		int min = 100000000;
		if (seilist.size() > 0) {
			min = Math.min(Math.abs(sei.getLast()), min);
		}
		if (fulist.size() > 0) {
			min = Math.min(Math.abs(fu.getFirst()), min);
		}

		while (check(goukei) && fu.size() > 0) {
			goukei.addFirst(fu.removeLast());
			goukei.removeLast();
			int a = goukei.getLast();
			a += Math.abs(goukei.getFirst()) * 2;
			min = Math.min((Math.abs(a)), min);
		}
		System.out.println(min);

	}
	public static int sum(ArrayList a) {
		int b = 0;
		for (int i = 0; i < a.size(); i++) {
			b += Math.abs((int)a.get(i));
		}
		return b;
	}
	public static boolean check(ArrayDeque a) {
		boolean tt = false;
		for (int i = 0; i < a.size(); i++) {
			int b = (int)a.peek();
			if (b > 0) {
				tt = true;
			}
		}
		if (tt) {
			return true;
		} else {
			return false;
		}
	}
}