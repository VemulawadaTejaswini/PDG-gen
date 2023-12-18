import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int a = 0;
		int i = 1;
		while (a == 0) {
			if (i % 2 == 0 && i % N == 0) {
				System.out.println(i);
				a++;
				return;
			}
			i++;
		}
	}
}
