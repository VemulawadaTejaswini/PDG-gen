import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		char[] str = scan.nextLine().toCharArray();
		int ans = 0;
		for (char s : str) {
			if (s == '1') ans++;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
