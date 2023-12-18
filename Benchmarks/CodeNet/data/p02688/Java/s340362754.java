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
		 * す１　す２　す３
		 * A[0]  A[1]  A[2]
		 */

		int N = sc.nextInt();
		int K = sc.nextInt();
		int d[] = new int[K];
		int A[] = new int[N];
		int no_snack = 0;

		for(int i = 0;i<K;i++) {

			d[i] = sc.nextInt();
			int a[] = new int[ d[i] ];
			for(int j = 0;j<d[i];j++) {
				a[j] = sc.nextInt();
			}

			for(int k = 0;k<d[k];k++) {
				A[ a[k]-1 ] += 1;

			}

		}

		for(int l = 0;l<N;l++) {
			if(A[l] == 0)
				no_snack++;
		}
		System.out.println(no_snack);

    }
}
