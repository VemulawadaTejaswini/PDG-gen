
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] Ni = new int[N];
		for (int i = 0; i < N; i++) {
			Ni[i] = scanner.nextInt();
		}

		int ans = (N-1)/(K-1);
		if((N-1)%(K-1)!=0)ans++;
		System.out.println(ans);

	}

}
