import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		sc.close();
		Collections.sort(a);// 昇順
		int m = 0;
		if (a.get(0) > 0) {
			for (int i = 0; i < n; i++) {
				m += a.get(i);
			}
			m -= a.get(0) * 2;
		} else {
			for(int i = 0;i<n;i++){
				m+=Math.abs(a.get(i));
			}
		}
		System.out.println(m);
		for(int i = 0;i<n;i++){
			System.out.println(a.get(a.size())+" "+a.get(0));
			a.add(a.get(a.size())-a.get(0));
			a.remove(a.size()-1);
			a.remove(0);
		}
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
