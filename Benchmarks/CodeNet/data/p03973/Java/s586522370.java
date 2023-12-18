
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static ArrayList<Integer> P = new ArrayList<Integer>();
	static Set<Integer> NowAvalable = new HashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int k = sc.nextInt();
			P.add(k);
		}
		System.out.println(check());

	}

	static int check() {
		initAvalable2();
		if (NowAvalable.size() == 0) {
			return 0;
		}
		int max = 0;
		Set<Integer> _ava = new HashSet<>(NowAvalable);
		ArrayList<Integer> _P = new ArrayList<>(P);
		for (Integer now : _ava) {
			sell(now);
			int x = check();
//			NowAvalable.add(now);
			NowAvalable.addAll(_ava);
			P.clear();
			P.addAll(_P);
			if (x + 1 > max) {
				max = x + 1;
			}
		}
		return max;
	}

	static void sell(int p) {
		for (int i = 0; i < P.size(); i++) {
			if (P.get(i) > p) {
				P.set(i, P.get(i) - p);
				return;
			}
		}
	}

	static boolean canSell(int p) {
		for (int i = 0; i < P.size(); i++) {
			if (P.get(i) > p)
				return true;
			if (P.get(i) == p)
				return false;
		}
		return false;
	}

	static void _initAvalable() {
		int Max = -1;
		for (int i = 0; i < P.size(); i++) {
			if (P.get(i) > Max)
				Max = P.get(i);
		}
		NowAvalable.clear();
		for (int i = 1; i < Max; i++) {
			NowAvalable.add(i);
		}
		for (Integer i : P) {
			if (NowAvalable.contains(i))
				NowAvalable.remove(i);
		}
	}

	static void initAvalable2() {
		NowAvalable.clear();
		int Max = -1;
		for (int i = 0; i < P.size(); i++) {
			if (P.get(i) > Max)
				Max = P.get(i);
		}
		for (int i = 1; i < Max; i++) {
			if (canSell(i)) {
				NowAvalable.add(i);
			}
		}

	}

}
