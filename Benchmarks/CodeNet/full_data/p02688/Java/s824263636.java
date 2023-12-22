import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*人数　種類　　　　　　　　３人　２種類
		 * お菓子１を持ってるやつ　　2人
		 * すぬけ　　　　　　　　　　１　　３
		 * おかし２をもってるやつ　　１人
		 * すぬけ　　　　　　　　　　３
		 *
		 *       す１　す２　す３
		 * A[0]  A[1]  A[2]  A[3]
		 */

		int N = sc.nextInt();
		int K = sc.nextInt();
		//int d[] = new int[K];
		int A[] = new int[N+1];
		//int no_snack = 0;

		for(int i = 0;i<K;i++) {

			int d = sc.nextInt();

			for(int j = 0;j<d;j++) {
				int sunuke = sc.nextInt();
				A[sunuke] = 1;
			}
		}

		int no_snack = N;
		for(int i = 1;i<=N;i++) {
			if(A[i] == 1)
				no_snack--;
		}
		System.out.println(no_snack);

    }
}
