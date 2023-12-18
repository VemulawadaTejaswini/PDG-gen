import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();
		int M2 = sc.nextInt();
		int D2 = sc.nextInt();
		if (M1 != M2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
