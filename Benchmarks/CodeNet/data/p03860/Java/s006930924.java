import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String s = sc.next();
		String c = sc.next();
		System.out.println("A" +s.charAt(0) + "C");
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}