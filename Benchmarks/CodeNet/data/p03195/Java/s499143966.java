import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a % 2 != 0) {
				System.out.println("first");
				return;
			}
		}
		System.out.println("second");
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
