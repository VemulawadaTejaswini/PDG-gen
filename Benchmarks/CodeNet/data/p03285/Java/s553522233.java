
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 3) {
			System.out.println("No");
		} else {
			int div = n / 4;
			boolean flag = false;
			for(int i = 0; i < n / 4 + 1; i++) {
				int tmp = n - 4 * i;
				if(tmp % 7 == 0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
