import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt(); // h
		int b = kb.nextInt(); // s
		int c = kb.nextInt(); // h
		int d = kb.nextInt(); // s
		while (true) {
			c -= b;
			if (c <= 0) {
				System.out.println("Yes");
				break;
			}
			a -= d;
			if (a <= 0) {
				System.out.println("No");
				break;
			}
		}
		kb.close();
	}

}
