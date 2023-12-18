import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			int n = sc.nextInt();
			List<Integer> pn = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				pn.add(sc.nextInt());
			}
			List<Integer> qn = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				qn.add(sc.nextInt());
			}

			Map<Integer, Integer> myMap = new HashMap<>();
			myMap.put(2, 1);
			myMap.put(3, 2);
			myMap.put(4, 6);
			myMap.put(5, 24);
			myMap.put(6, 120);
			myMap.put(7, 720);
			myMap.put(8, 5040);

			int pnCnt = 0;

			for (int i = 0; i < n - 1; i++) {
				int myNum = pn.get(i);
				int base = 0;
				for (int j = i + 1; j < n; j++) {
					int otherNum = pn.get(j);
					if (myNum > otherNum) {
						base++;
					}
				}
				pnCnt = pnCnt + myMap.get(n - i) * base;
			}

			int qnCnt = 0;
			for (int i = 0; i < n - 1; i++) {
				int myNum = qn.get(i);
				int base = 0;
				for (int j = i + 1; j < n; j++) {
					int otherNum = qn.get(j);
					if (myNum > otherNum) {
						base++;
					}
				}
				qnCnt = qnCnt + myMap.get(n - i) * base;
			}

			System.out.println(pnCnt > qnCnt ? pnCnt - qnCnt : qnCnt - pnCnt);
		}
	}
}