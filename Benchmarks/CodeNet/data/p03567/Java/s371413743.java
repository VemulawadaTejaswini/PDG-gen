import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length()-1; i++) {
			char a = s.charAt(i);
			if(a == 'A') {
				char b = s.charAt(i+1);
				if(b == 'C') {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}