import java.util.Scanner;

public class A131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] list = s.toCharArray();

		if (list[0] == list[1] || list[1] == list[2] || list[2] == list[3]) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}

		sc.close();
	}
}