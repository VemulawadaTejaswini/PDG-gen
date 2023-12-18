import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i <= 32; i++) {
			if (input > i * i) {
				continue;
			}
			System.out.println((i-1)*(i-1));
          	break;
		}
	}
}