

import java.util.Scanner;


class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int diff = Math.abs(a + b);
		if (diff >= x) {
			System.out.println("YES");
		} else
			System.out.println("NO");
	}
}
