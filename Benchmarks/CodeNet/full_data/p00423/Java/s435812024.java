import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = Integer.parseInt(sc.nextLine());
		while (0 < times) {
			compare(sc, times);
			times = Integer.parseInt(sc.nextLine());
		}
	}
	
	private static void compare(Scanner sc, int times) {
		int a_total = 0, b_total = 0;
		int counter = 1;
		while (counter <= times) {
			String[] line = sc.nextLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			if (a > b) { a_total += a + b; }
			if (a < b) { b_total += a + b; }
			if (a == b) {
				a_total += a;
				b_total += b;
			}
			counter++;
 		}
		System.out.println(a_total + " " + b_total);
	}
}