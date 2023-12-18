import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		for (int i = 0; i < 4; i++) {
			System.out.print(c[i]);
		}
		System.out.print(" ");
		for (int i = 5; i < 12; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
