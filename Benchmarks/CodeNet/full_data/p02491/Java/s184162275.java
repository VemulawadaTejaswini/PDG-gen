import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}

	Main() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a / b) + " " + (a % b) + " "
				+ ((double) a / (double) b) + "0000000");
	}
}