import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ABC086A(); 
		//ABC081A();
		TravelingPlan();
	}

	public static void TravelingPlan() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		for(int a = 0; a < N; a++) {
			int ans = 0;
			int pos = 0;
			for(int i = 0; i < N; i++) {
				if(i == a)
					continue;
				ans += Math.abs(A[i] - pos);
				pos = A[i];
			}
			if(a == N-1)
				ans += Math.abs(A[N-2]);
			else
				ans += Math.abs(A[N-1]);
			System.out.println(ans);
		}

	}
}