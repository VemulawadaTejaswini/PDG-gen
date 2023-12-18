import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long temp = 0;
		if(N % (A + B) > A) {
			temp = A;
		} else {
			temp = N % (A + B);
		}
		System.out.println(A * (N / (A + B)) + temp);
	}
}
