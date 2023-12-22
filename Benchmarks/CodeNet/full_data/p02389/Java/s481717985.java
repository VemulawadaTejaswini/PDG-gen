import java.util.Scanner;
class Main {

	public void watch() {

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();

		int h = S / 60 / 60;

		int m = (S - h * 60 * 60) / 60;

		int s = S - (h * 60 * 60 + m * 60);

		System.out.println(h + ":" + m + ":" + s);

	}

	public static void main(String[] args) {

		new Main().watch();

	}

}