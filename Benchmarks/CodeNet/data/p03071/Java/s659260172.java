import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int ans = 0;
		if(A >B) {
			ans += A;
			A--;
		}else {
			ans += B;
			B--;
		}
		ans += Math.max(A, B);
		System.out.println(ans);
	}

}
