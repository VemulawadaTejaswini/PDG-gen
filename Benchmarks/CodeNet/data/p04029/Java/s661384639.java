import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int childNo = sc.nextInt();
		int candy = 0;

		for (int i = 0; i < childNo; i++) {
			candy += i + 1;
		}
		System.out.println(candy);
		sc.close();
	}
}
