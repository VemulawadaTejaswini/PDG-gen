import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			ll.add(sc.nextInt());
		}
		sc.close();
		int pos = 0;
		int now = -1;
		int ans = 0;
		while (pos < n) {
			now = -1;
			ans++;
			for (int i = pos; i < n; i++) {
				if (now < ll.get(i)) {
					now = ll.get(i);
					ll.add(pos, now);
					ll.remove(i + 1);
					pos++;
				}
			}
		}
		System.out.println(ans);
	}

	public static int[] arrayInt(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static long[] arrayLong(Scanner sc, int n) {
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		return array;
	}

	public static double[] arrayDouble(Scanner sc, int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}
