import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] H = new long[N];
		for(int i = 0;i < N;i++){
			H[i] = sc.nextLong();
		}
		sc.close();
		Arrays.sort(H);
		long cnt = 0;
		for(int i = 0;i < N-K;i++){
			cnt += H[i];
		}
		System.out.println(cnt);
	}
}