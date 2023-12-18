import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] balls = new int[N];
		for (int i = 0; i < N; i++) {
			balls[i] = input.nextInt();
		}
		int k=0; int cnt = 0;
		while (k<N) {
			for (int i = 0; i < N-1; i++) {
				if (i!=k) {
					for (int j = i+1; j < N; j++) {
						if (balls[i]==balls[j]&&j!=k) cnt++;
					}
				}
			}
			System.out.println(cnt);
			cnt=0;
			k++;
		}
	}
}