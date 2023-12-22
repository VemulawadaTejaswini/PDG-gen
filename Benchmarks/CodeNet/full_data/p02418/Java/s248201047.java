import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		s = s + s;
		char[] sc = s.toCharArray();
		char[] ps = p.toCharArray();
		boolean flag = false;
		for (int i = 0; i < sc.length - ps.length; i++) {
			if (sc[i] == ps[0]) {
				for (int j = 0; j < ps.length; j++) {
					if (sc[i + j] != ps[j]) break;
					if (j == ps.length - 1 && sc[i + j] == ps[j]) {
						System.out.println("Yes");
						flag = true;
					}
				}
			}
			if (flag == true) break;
		}
		if (flag == false)
			System.out.println("No");
	}
	public static void main(String[] args) {
		new Main().run();
	}
}