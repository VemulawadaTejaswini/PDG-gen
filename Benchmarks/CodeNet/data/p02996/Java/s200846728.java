import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ABPare {

	long A;
	long B;

	public ABPare(long a, long b) {
		A = a;
		B = b;
	}

	public long getA() {
		return A;
	}

	public long getB() {
		return B;
	}
}

class BComp implements Comparator<ABPare> {
	public int compare(ABPare o1, ABPare o2) {
		return o1.B < o2.B ? -1 : 1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<ABPare> ABList = new ArrayList<ABPare>(N);
		for (int i = 0; i < N; i++) {
			long A_i = sc.nextLong();
			long B_i = sc.nextLong();
			ABList.add(new ABPare(A_i, B_i));
		}
		sc.close();
		// これA，BのペアをB_i基準で昇順に並べ替えたらOKでは？

		Collections.sort(ABList, new BComp());

		// for (int i = 0; i < ABList.size(); i++) {
		// String str = "A_" + i + ":" + ABList.get(i).getA();
		// str += ",B_" + i + ":" + ABList.get(i).getB();
		// System.out.println(str);
		// }

		long sum_A = 0;
		for (int i = 0; i < ABList.size(); i++) {
			sum_A += ABList.get(i).getA();
			if (sum_A > ABList.get(i).getB()) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}