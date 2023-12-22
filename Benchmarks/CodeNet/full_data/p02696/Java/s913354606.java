import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, n;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		n = scan.nextInt();

		int num = 0;
		int max = 0;
		for(int i = 1; i <= n; i++) {
			num = (int)(Math.floor(a*i/b) - a * Math.floor(i/b));

			if(max < num) {
				max = num;
			}
		}

		System.out.println(max);
	}
}
