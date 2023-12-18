import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n, k;
		n = scan.nextInt();
		k = scan.nextInt() - 1;
		StringBuilder s = new StringBuilder(scan.next());
		s.setCharAt(k, (char) (s.charAt(k) + 32));
		System.out.println(s);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
