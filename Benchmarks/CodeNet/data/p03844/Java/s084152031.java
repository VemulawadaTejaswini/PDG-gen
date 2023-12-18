import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String op = sc.next();
		int B = sc.nextInt();
		if(op.equals("+")) {
			System.out.println(A + B);
			sc.close();
			return;
		}else {
			System.out.println(A - B);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}