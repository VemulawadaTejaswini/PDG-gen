import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aStr = sc.next();
		String bStr= sc.next();
		int a = 0;
		int b = 0;
		try {
			a = Integer.parseInt(aStr);
			b = Integer.parseInt(bStr);
			if (a >= 1 && b <= 100) {
				int area = a * b;
				int circ = 2 * a + 2 * b;
				System.out.println(area + " " + circ);
			}
		} catch (Exception e) {
			System.out.println("error");
		}
		sc.close();
	}
}