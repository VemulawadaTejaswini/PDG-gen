import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		long s = N/(A+B)*A;
		long k = N%(A+B);
		s += Math.min(A,k);
		System.out.println(s);
	}

}