import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		if(A==0&&B==0)
		{
			System.out.println(0);
		}
		long C = A + B;
		long D = N / C;
		long E=N-D*C;
		long ans=D*A+E;

		System.out.println(ans);

	}
}