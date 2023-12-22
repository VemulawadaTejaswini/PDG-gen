import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;

		while(K>0) {
			if(A>0) {
				ans++;
				A--;
				K--;
				continue;
			}
			if(B>0) {
				B--;
				K--;
				continue;
			}
			if(C>0) {
				ans--;
				A--;
				K--;
				continue;
			}
		}

		System.out.println(ans);
	}
}
