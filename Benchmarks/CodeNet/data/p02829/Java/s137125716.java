import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		switch (a + b) {
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(2);
			break;
		case 5:
			System.out.println(1);
			break;
		}
	}
}
