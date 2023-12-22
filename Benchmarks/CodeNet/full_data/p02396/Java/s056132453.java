import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tmp;
		int num = 1;

		while ((tmp = sc.nextInt()) != 0) {
			System.out.println("Case " + num + ": " + tmp);
			num++;
		}
	}
}
