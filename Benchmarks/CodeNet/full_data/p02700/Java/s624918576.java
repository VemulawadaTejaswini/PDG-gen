import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int D = stdIn.nextInt();
		while(true) {
			C -= B;
			if(C <= 0) {
				break;
			}
			A -= D;
			if(A <= 0) {
				break;
			}
		}
		if(A <= 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}