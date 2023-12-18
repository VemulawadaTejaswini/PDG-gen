import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long oddNum = 0;
		while(scan.hasNext()) {
			long num = scan.nextLong();
			if ((num % 2) == 1) {
				oddNum++;
			}
		}
		if (oddNum % 2 == 1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
