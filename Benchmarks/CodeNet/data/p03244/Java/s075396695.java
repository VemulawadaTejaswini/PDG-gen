
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			HashMap<Integer, Integer> odd = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> even = new HashMap<Integer, Integer>();

			boolean allSame = true;
			int before = 0;
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if (i != 0 && before != v) {
					allSame = false;
				}
				if (i % 2 == 0) {
					if (odd.containsKey(v)) {
						odd.put(v, odd.get(v) + 1);
					} else {
						odd.put(v,  1);
					}
				} else {
					if (even.containsKey(v)) {
						even.put(v, even.get(v) + 1);
					} else {
						even.put(v,  1);
					}
				}
				before = v;
			}

			if (allSame) {
				System.out.println(n / 2);
				return;
			}

			if (odd.keySet().size() == 1 && even.keySet().size() == 1 && !odd.keySet().toArray()[0].equals(even.keySet().toArray()[0])) {
				System.out.println(0);
				return;
			}

			int oddMaxValue = 0;
			int oddMaxCount = 0;
			for (int i : odd.keySet()) {
				if (oddMaxCount < odd.get(i)) {
					oddMaxValue = i;
					oddMaxCount = odd.get(i);
				}
			}
			int oddNextValue = 0;
			int oddNextCount = 0;
			for (int i : odd.keySet()) {
				if (oddNextCount < odd.get(i) && i != oddMaxValue) {
					oddNextValue = i;
					oddNextCount = odd.get(i);
				}
			}

			int evenMaxValue = 0;
			int evenMaxCount = 0;
			for (int i : even.keySet()) {
				if (evenMaxCount < even.get(i)) {
					evenMaxValue = i;
					evenMaxCount = even.get(i);
				}
			}
			int evenNextValue = 0;
			int evenNextCount = 0;
			for (int i : even.keySet()) {
				if (evenNextCount < even.get(i) && i != evenMaxValue) {
					evenNextValue = i;
					evenNextCount = even.get(i);
				}
			}

			if (oddMaxValue != evenMaxValue) {
				System.out.println(n - oddMaxCount - evenMaxCount);
			} else {
				if (oddMaxCount == evenMaxCount) {
					if (oddNextCount < evenNextCount) {
						System.out.println(n - oddMaxCount - evenNextCount);
					} else {
						System.out.println(n - oddNextCount - evenMaxCount);
					}
				} else {
					if (oddMaxCount < evenMaxCount) {
						System.out.println(n - oddNextCount - evenMaxCount);
					} else {
						System.out.println(n - oddMaxCount - evenNextCount);
					}
				}
			}
			return;
		}
	}
}
