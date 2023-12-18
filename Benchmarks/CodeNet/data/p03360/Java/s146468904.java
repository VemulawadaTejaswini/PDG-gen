import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int Ans = 0;
		int Max = Math.max(A, B);
		Max = Math.max(Max, C);
		if (Max == A) {
			Ans = (A * 2 * K) + B + C;
		} else if (Max == B) {
			Ans = (B * 2 * K) + A + C;
		} else {
			Ans = (C * 2 * K) + A + B;
		}
		System.out.println(Ans);
	}
}