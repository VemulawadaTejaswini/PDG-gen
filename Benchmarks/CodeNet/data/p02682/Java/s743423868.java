import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int K = stdIn.nextInt();
		
		int fromA = 0;
		int fromB = 0;
		int fromC = 0;
		
		if(K <= A) {
			fromA = K;
		}else {
			fromA = A;
			if(K - A <= B) {
				fromB = K - A;
			}else {
				fromB = B;
				fromC = K - A - B;
			}
		}
		
		System.out.println(fromA - fromC);

	}

}