import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		
		long ans = 0;
		long min;
		long max;
		for(int i = K; i <= N + 1; i ++) {
			min = 0;
			max = 0;
			for(int j = 0; j < i; j ++) {
				min += j;
				max += N - j;
			}
			ans += max - min + 1;
		}
		System.out.println((long)(ans % (Math.pow(10, 9) + 7)));
	}
}