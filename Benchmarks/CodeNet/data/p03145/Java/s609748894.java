import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c, area;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		area = a * b / 2;
		System.out.println(area);
	}

}
