import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer A = scan.nextInt();
		Integer B = scan.nextInt();
		Integer area = 0;
		if (A > 2 && A < 100) {
			if (B > 2 && B < 100) {
				area = (A - 1) * (B - 1);
			}
			System.out.println(area);
		}
	}
}
