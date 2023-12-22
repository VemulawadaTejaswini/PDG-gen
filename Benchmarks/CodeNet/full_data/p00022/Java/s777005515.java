import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}

			int x = 0;
			int temp = 0;
			for (int i = 0; i < n; i++) {
				x += scan.nextInt();
				if (x <= 0) {
					x = 0;
				} else {
					if (x >= temp) {
						temp = x;
					}
				}
			}
			System.out.println(temp);
		}
		scan.close();
	}
}