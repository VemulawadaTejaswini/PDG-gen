import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A[] = new int[N];
		for(int i=0; i<N; i++) A[i] = sc.nextInt();
		int ans = 0;
		sc.close();
		int max;
		int ind = 0;
		
		for(int i=0; i<N; i++) {
			max = 0;
			for(int j=0; j<N; j++) {
				if(max < A[j]) {
					max = A[j];
					ind = j;
				}
			}
			A[ind] = 0;
			if(i%2 == 0) ans += max;
			else 		 ans -= max;
		}
		System.out.println(ans);
	}
}