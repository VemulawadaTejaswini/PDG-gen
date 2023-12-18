
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		String[] N = sc.next().split("");
		int K = sc.nextInt();
		boolean[] num = new boolean[10];
		Arrays.fill(num, true);
		for (int i = 0; i < K; i++) {
			num[sc.nextInt()] = false;
		}

		Set<String> use = new TreeSet<String>();
		Set<String> use0 = new TreeSet<String>();

		if (num[0]) {
			use0.add(Integer.toString(0));
		}

		for (int i = 1; i <= 9; i++) {
			if (num[i]) {
				use.add(Integer.toString(i));
				use0.add(Integer.toString(i));
			}
		}

		boolean f = false;
		for (String str : use) {
			if (N[1].compareTo(str) == 0) {
				System.out.print(str);
				f = true;
				break;
			} else if (N[1].compareTo(str) < 0) {
				System.out.print(str);
				break;
			}
		}

		for (int i = 2; i < N.length; i++) {
			if (f) {
				for (String str : use0) {
					if (N[i].compareTo(str) <= 0) {
						System.out.print(str);
						break;
					}
				}
			} else {
				for (String str : use0) {
					System.out.print(str);
					break;
				}
			}
		}

		System.out.println();

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
