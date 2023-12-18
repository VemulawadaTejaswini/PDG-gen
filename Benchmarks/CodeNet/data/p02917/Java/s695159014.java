import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		int[] B = new int[N-1];
		for(int i = 0;i < N-1;i++) {
			B[i] = scn.nextInt();
		}
		ans += B[0] + B[N-2];
		for(int i = 0;i < N-2;i++) {
			ans += Math.min(B[i], B[i+1]);
		}
		System.out.println(ans);
	}

}