import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next() ;

		// Sの長さ
		int N = S.length();

		String left = S.substring(0, (N-1)/2);
		String right = S.substring((N+3)/2-1, N);


		if(left.equals(right)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
