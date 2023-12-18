import java.util.Scanner;
public class Main {
	public static int kiriage(int a, int b) {
		if(a % b == 0)
			return a/b;
		else
			return a/b+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		int point1 = 0;
		for(int i = 0; i < N; i++)
			if(sc.nextInt() == 1) point1 = i;
		ans += kiriage(point1,K-1) + kiriage(N-1-point1, K-1);
		System.out.println(ans);
	}

}