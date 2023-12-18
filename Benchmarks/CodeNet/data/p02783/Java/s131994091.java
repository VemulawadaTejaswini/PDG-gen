import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int A = scan.nextInt();
		
		if (H % A != 0) {
			System.out.println((H/A +1));
		} else {
			System.out.println(H/A);
		}

	}

}