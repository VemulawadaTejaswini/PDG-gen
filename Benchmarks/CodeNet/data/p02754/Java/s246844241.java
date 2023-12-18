import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int S = (N / (A + B) * A);
		if(A != 0) {			
			S += (N % (A + B));
		};
		System.out.println(S);
		sc.close();
	}
}