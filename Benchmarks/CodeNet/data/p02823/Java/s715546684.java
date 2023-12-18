import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long result;
		if ((B-A)%2==0) {
			System.out.println((B-A)/2);
		} else {
			long up,down,mid;
			up = A+(B-A*2+1)/2;
			down = N-B+1+(N-(A+N-B))/2;
			if (B-A==1) {
				if(A>N-A) {
					System.out.println(N-A);
				} else {
					System.out.println(A);
				}
			} else {
				if (up>down) {
					System.out.println(down);
				} else {
					System.out.println(up);
				}
			}
		}
	}



}