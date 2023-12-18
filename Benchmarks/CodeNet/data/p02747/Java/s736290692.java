import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split("");
		sc.close();
		String before = "";
		for (String s : in) {
			if (before.equals("h")) {
				if (!s.equals("i")) {
					System.out.println("No");
					return;
				}
			} else if (before.equals("i")) {
				if (!s.equals("h")) {
					System.out.println("No");
					return;
				}
			} else {
				break;
			}
			before = s;
		}
		System.out.println("Yes");
	}
}
