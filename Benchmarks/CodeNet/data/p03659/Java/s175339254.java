import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n, x,min = Integer.MAX_VALUE;
		n = stdin.nextInt();
		int[] A = new int[n];
		A[0] = stdin.nextInt();
		for (int i = 1; i < n; i++) {
			//累積和の配列
			A[i] = A[i - 1] + stdin.nextInt();
		}
		if (n == 2) {
			//すぬけくんもアライさんも１枚の時
		min=Math.abs(A[1]-2*A[0]);
		} else {
			for (int i = 0; i < n - 1; i++) {
				x=Math.abs(A[n - 1]-A[i]) - Math.abs(A[i]);
				if (Math.abs(x)< min) {
					min = Math.abs(x);
				}
			}
		}
		System.out.println(min);

	}

}
