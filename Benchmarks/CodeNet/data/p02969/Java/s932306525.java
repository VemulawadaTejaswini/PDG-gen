import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		int area = 3*r*r;
		System.out.println(area);
		sc.close();
	}
}
