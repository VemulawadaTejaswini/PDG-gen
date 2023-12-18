import java.util.Scanner;

//AtCoder Beginner Contest 159
//D - Banned K
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A[] = new int[N];
		int C[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			C[A[i]-1]++;
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			int ans = 0;
			for (int j = 0; j < N; j++) {
				if (A[i]-1!=j) {
					if (C[j] > 1) {
						ans += (C[j]*(C[j]-1))/2;
					}
				} else {
					if (C[j] > 2) {
						ans += ((C[j]-1)*(C[j]-2))/2;
					}
				}
			}
			System.out.println(ans);
		}
	};
}
