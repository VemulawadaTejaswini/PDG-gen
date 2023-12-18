import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] T = new int[N];
		for(int i = 0;i < N;i++)
		{
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];
		for(int i = 0;i < M;i++)
		{
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0;i < N;i++)
		{
			sum += T[i];
		}
		for(int i = 0; i < M;i++)
		{
			int y = P[i];
			int num = sum - T[y - 1];
			int ans = num + X[i];
			System.out.println(ans);
		}
	}

}
