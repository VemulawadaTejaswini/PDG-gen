import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int ans = N * (N - 1) / 2 + M * (M - 1) / 2;

		System.out.println(ans);
		stdIn.close();
	}
}