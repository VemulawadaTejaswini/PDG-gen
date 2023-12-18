import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		String s = sc.next();
		char cbefore = s.charAt(0);
		for(int i = 1;i < s.length();i ++) {
			char c = s.charAt(i);
			if(cbefore == c) {
				System.out.println("Bad");
				return;
			}
			cbefore = c;
		}
		System.out.println("Good");
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}