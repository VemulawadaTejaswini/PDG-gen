import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		Set<Long> set = new HashSet<Long>();
		for (int i = 0; i < d.length; i++) {
			long val = d[i];
			set.add(val);
			for (int j = i + 1; j < d.length; j++) {
				val *= 10;
				val += d[j];
				set.add(val);
			}
		}
		for (long i = 0; i < Long.MAX_VALUE; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}