import java.util.Scanner;

public class Main {
	static void call(int n) {
		int i = 1;
		while (i <= n) {
			if (i % 3 == 0)
				System.out.print(" " + i);
			else if (i % 10 == 3)
				System.out.println(" " + i);
			else if (i / 10 != 0 && (i / 10) % 3 == 0)
				System.out.println(" " + i);
			else if (i / 100 != 0 && (i / 100) % 3 == 0)
				System.out.println(" " + i);
			else if (i / 1000 != 0 && (i / 1000) % 3 == 0)
				System.out.println(" " + i);
			else if (i / 10000 != 0 && (i / 10000) % 3 == 0)
				System.out.println(" " + i);
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		call(input);
	}
}