import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		//int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		TreeMap<Integer, Integer> tm = new TreeMap<>();

		for (int i = 1; i <= n; i++) {
			tm.put(Integer.parseInt(sc.next()), i);
		}

		for (Integer x : tm.keySet()) {
			System.out.print(tm.get(x) + " ");
		}

		sc.close();
	}
}