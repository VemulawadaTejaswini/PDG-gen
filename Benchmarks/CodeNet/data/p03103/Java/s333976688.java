import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class AB {
	private Long fA;
	private int fB;

	public AB(Long a, int b) {
		fA = a;
		fB = b;
	}

	public Long getA() {
		return fA;
	}

	public int getB() {
		return fB;
	}

	public void setB(int b) {
		fB = b;
	}
}

class compAB implements Comparator<AB> {
	public int compare(AB ab1, AB ab2) {
		if (ab1.getA() < ab2.getA()) {
			return -1;
		} else {
			return 1;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<AB> ABList = new ArrayList<AB>(N);
		for (int i = 0; i < N; i++) {
			Long a = sc.nextLong();
			int b = sc.nextInt();
			ABList.add(new AB(a, b));
		}

		Collections.sort(ABList, new compAB());

		long c = 0;
		int id = 0;
		for (int j = 0; j < M; j++) {
			c += ABList.get(id).getA();
			ABList.get(id).setB(ABList.get(id).getB() - 1);
			if (ABList.get(id).getB() <= 0) {
				id++;
			}
		}

		System.out.println(c);

		sc.close();
	}
}