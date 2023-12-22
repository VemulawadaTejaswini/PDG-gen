import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		if (N == 0) {
			System.out.println(X);
			return;
		}
		for (int i = 0; i < N; i++) {
			int pi = sc.nextInt();
			list.add(pi);
		}
		if (!list.contains(X)) {
			System.out.println(X);
			return;
		}
		Collections.sort(list);
		int Xb = X;
		int Xs = X;
		while (true) {
			int Xbi = Xb+1;
			int Xsm = Xs-1;
			if (!list.contains(Xs)) {
				System.out.println(Xs);
				return;
			}
			if (!list.contains(Xb)) {
				System.out.println(Xb);
				return;
			}
			Xb = Xbi;
			Xs = Xsm;
		}
	}
}