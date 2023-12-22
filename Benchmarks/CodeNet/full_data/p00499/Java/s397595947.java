
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int L = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		
		while(true) {
			boolean d = false;
			if(A > 0) {
				A -= C;
				d = true;
			}
			if(B > 0) {
				B -= D;
				d = true;
			}
			if(d) {
				L--;
			}
			else {
				break;
			}
		}
		System.out.println(L);
	}
}