import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int cnt = 1;
		if (b != a) {
			cnt++;
		}
		if (c != a && c != b) {
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
