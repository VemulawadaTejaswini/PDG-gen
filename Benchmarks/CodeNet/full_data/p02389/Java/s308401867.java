import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.printf("%d %d\n", num1*num2, num1*2 + num2*2);
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}