
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int a = S / 100;
		int b = S % 100;
		if(0 < a || a <= 12) {
			if(0 < b || b <= 12) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if(0 < b || b <= 12) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}

	}

}
