import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int ans = 0;
		
		if(A > B) {
			ans = A + (A - 1);
		}else if(B > A) {
			ans = B + (B - 1);
		}else {
			ans = A + B;
		}
		
		System.out.println(ans);
	}
}