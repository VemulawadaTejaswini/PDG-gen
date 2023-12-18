import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int[] T = new int[N+1];
		int ans = 0;
		int count = 0;

		for (int i=0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		T[N] = 100;

		Arrays.sort(T);

		for (int i = 0; i < N; i++) {
		//	System.out.println(T[i]);
			if(T[i] + K >= T[i+1]) {
			//	System.out.println("入った");
				if(count < C){
					count++;
					if (count == C) {
						count=0;
						ans++;
					}
				} else {
					count = 0;
					ans++;
				}
			}else {
				count = 0;
				ans++;
			}
		}
		if (count > 0) {
			count = 0;
			ans++;
		}

		System.out.println(ans);
	}

}