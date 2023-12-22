
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		outer: while (i < 50) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int sum = m + f;
			if (m > 50 || f > 50 || r > 100) {
				System.out.println("-1 <= m,f <=50,-1<=r<=100で入力してください");
				continue outer;
			} else if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m * f < 0) {
				System.out.println("F");
			} else if (sum >= 80) {
				System.out.println("A");
			} else if (sum >= 65) {
				System.out.println("B");
			} else if (sum >= 50) {
				System.out.println("C");
			} else if (sum >= 30) {
				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
			i++;
		}
	}

}

