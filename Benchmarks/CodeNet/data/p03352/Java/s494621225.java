import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1000) {
			System.out.println(1000); return;
		} else if (x <= 512 && x > 529) {
			System.out.println(512); return;
		} else if (x <= 343 && x > 361) {
			System.out.println(343); return;
		} else if (x <= 243 && x > 256) {
			System.out.println(243); return;
		} else if (x <= 196 && x > 225) {
			System.out.println(196); return;
		} else if (x <= 128 && x > 144) {
			System.out.println(128); return;
		} else if (x <= 125 && x > 128) {
			System.out.println(125); return;
		} else if (x <= 32 && x > 36) {
			System.out.println(32); return;
		} else if (x <= 27 && x > 32) {
			System.out.println(27); return;
		} else if (x == 8) {
			System.out.println(8); return;
		} else {
			int i = (int) Math.sqrt(x);
			System.out.println(i*i);
		}
	}
}