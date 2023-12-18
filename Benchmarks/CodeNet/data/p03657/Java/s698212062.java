import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int flag = 0;
		if (a % 3 == 0) {
			flag++;
		}
		if (b % 3 == 0) {
			flag++;
		}
		if ((a + b) % 3 == 0) {
			flag++;
		}
		if (flag == 0) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible1");
		}
	}
}