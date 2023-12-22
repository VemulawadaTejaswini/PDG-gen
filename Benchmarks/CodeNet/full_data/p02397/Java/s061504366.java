
public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int i = 0;
		do {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 || y == 0) {
				break;
			}
			if (x > y) {
				System.out.println(x + " " + y);
			} else if (x < y) {
				System.out.println(y + " " + x);
			}
			i++;

		} while (i < 3000);
	}

}

