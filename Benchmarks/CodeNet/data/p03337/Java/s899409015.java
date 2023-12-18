import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(Math.max(Math.max(a+b, a-b), a*b));
	}
}