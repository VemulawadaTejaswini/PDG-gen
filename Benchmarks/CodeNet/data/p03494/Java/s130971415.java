import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int minCount = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			a = sc.nextInt();
			while(true) {
				if (count != 0) {
					a /= (2 * count);
				}
				if (a % 2 != 0) {
					break;
				}
				count++;
			}
			if (i == 0) {
				minCount = count;
			} else if (count < minCount) {
				minCount = count;
			}
		}
		System.out.println(minCount);
	}

}
