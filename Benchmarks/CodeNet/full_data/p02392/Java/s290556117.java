import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner scan = null;
	try {
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if ((a < b) && (b < c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	} catch (InputMismatchException e) {
		System.out.println("??????????????????????????????");
	} finally {
		scan.close();
	}
    }
}