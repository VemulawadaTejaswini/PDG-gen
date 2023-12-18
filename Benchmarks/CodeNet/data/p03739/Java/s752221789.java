import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		long ans1 = 0;
		long sum1 = 0;
		long sign1 = 1;
		for (int i = 0; i < n; i++) {
			sum1 += a.get(i);
			if (sum1 * sign1 <= 0) {
				ans1 += Math.abs(sum1) + 1;
				sum1 = sign1;
			}
			sign1 *= -1;
		}

		long ans2 = 0;
		long sum2 = 0;
		long sign2 = -1;
		for (int i = 0; i < n; i++) {
			sum2 += a.get(i);
			if (sum2 * sign2 <= 0) {
				ans2 += Math.abs(sum2) + 1;
				sum2 = sign2;
			}
			sign2 *= -1;
		}

		System.out.println(Math.min(ans1, ans2));
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
