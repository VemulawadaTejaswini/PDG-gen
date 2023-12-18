import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		int n;
		String out = "";
		for(int i = 0; i < N; i++) {
			n = sc.nextInt();
			A[0][n-1] = i + 1;
		}
		for(int i = 0; i < N; i++) {
			out = out + A[0][i] + " ";
		}
		System.out.println(out);
		sc.close();
	}

}
