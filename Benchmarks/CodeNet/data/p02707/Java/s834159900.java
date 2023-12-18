import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N - 1];
		int[] ans = new int[N];
		for(int i = 0; i < N - 1; i ++) {
			A[i] = stdIn.nextInt();
		}
		for(int i = 0; i < N; i ++) {
			ans[i] = 0;
		}
		for(int i = 0; i < A.length; i ++) {
			ans[A[i] - 1] ++;
		}
		
		for(int i = 0; i < ans.length; i ++) {
			System.out.println(ans[i]);
		}
	}
}