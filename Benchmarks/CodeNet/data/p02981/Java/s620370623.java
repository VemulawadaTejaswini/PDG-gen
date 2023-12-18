import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		if(N*A >= B) {
			System.out.println(B);
		}
		else {
			System.out.println(N*A);
		}

	}

}