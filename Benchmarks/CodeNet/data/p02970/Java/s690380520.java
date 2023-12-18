import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt() * 2 + 1;
		int ans =0;
		ans = N/D;
		if (N%D > 0) {ans++;}

		System.out.println(ans);

	}
}
