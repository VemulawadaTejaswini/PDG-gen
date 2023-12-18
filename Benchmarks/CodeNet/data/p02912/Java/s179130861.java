import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Set<Integer> set = new TreeSet<>();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			p[i] = num;
			set.add(num);
		}

		Arrays.sort(p);

		while (m > 0) {
			int max = ((TreeSet<Integer>) set).last();
			for (int i = p.length - 1; i >= 0; i--) {
				if (p[i] == max) {
					p[i] >>= 1;
					set.remove(max);
					set.add(max >> 1);
					m--;
					break;
				}
			}
		}

		long sum = 0;
		for (long num : p) {
			sum += num;
		}

		System.out.println(sum);

		sc.close();
	}
}
