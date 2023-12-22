import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;
		int num = sc.nextInt();

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			if (a >= num) {
				num = a;
			} else {
				result = result + num - a;
			}
		}

		System.out.println(result);

	}

}
