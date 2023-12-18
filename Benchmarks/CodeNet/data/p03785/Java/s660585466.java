import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int[] T = new int[N];
		int ans = 0;
		int count = 0;
		int a = 0;

		for (int i=0; i < N; i++) {
			T[i] = sc.nextInt();
		}


		Arrays.sort(T);

		a = T[0];

		for (int i = 0; i < N; i++) {
			//System.out.println(T[i]);

			if (count == 0) {
				a = T[i];
			}
			if (i == N -1 ) {
				if(a + K >= 0) {
//					System.out.println("入った");
					count++;
					if (count == C) {
						count=0;
						ans++;
//						System.out.println("出発4");
					}
				}else {
					count = 0;
					ans++;
//					System.out.println("出発5");

				}
			} else if(a + K >= T[i+1]) {
			//	System.out.println("入った");
				count++;
				if (count == C) {
					count=0;
					ans++;
	//				System.out.println("出発1");
				}
			}else {
				count = 0;
				ans++;
		//		System.out.println("出発2");
			}
		}
		if (count > 0) {
			count = 0;
			ans++;
			//System.out.println("出発3");
		}

		System.out.println(ans);
	}

}