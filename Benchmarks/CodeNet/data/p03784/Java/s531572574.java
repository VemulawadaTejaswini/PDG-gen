import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A <= B) {
			System.out.println("Impossible");
			return;
		}

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.add(0);
		for (int i = 1; i < A + B; ++i) {
			System.out.println("? " + (stack.getFirst() + 1) + " " + (i + 1));
			String s = sc.next();
			if (s.equals("Y")) {
				stack.addFirst(i);
			} else {
				stack.removeFirst();
			}
		}
		int ori = stack.getFirst();
		boolean[] beHonest = new boolean[A + B];
		beHonest[ori] = true;
		for (int i = 0; i < A + B; ++i) {
			if (i == ori)
				continue;
			System.out.println("? " + (ori + 1) + " " + (i + 1));
			String s = sc.next();
			if (s.equals("Y")) {
				beHonest[i] = true;
			}
		}
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < A + B; ++i) {
			if (beHonest[i]) {
				ans.append("1");
			} else {
				ans.append("0");
			}
		}
		System.out.println("! " + ans);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}