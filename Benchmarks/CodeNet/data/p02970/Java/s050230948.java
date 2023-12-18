import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int tree = 0;
		int number = 0;
		for (int i=1; i<=n; i++) {
			if (i-d < 1) {
				if (i+d >= n) {
					number++;
					break;
				}
			} else if (i-d == 1) {
				tree = i+d;
				number++;
			} else {
				if (i+d == n) {
					number++;
					break;
				}
				if (i-d == tree+1) {
					tree = i+d;
					number++;
				}
				if (tree >= n) {
					break;
				}
			}
		}

		System.out.println(number);
		sc.close();
	}
}
