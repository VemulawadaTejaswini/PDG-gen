import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int max_profit = 0;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if(A[j] - A[i] == max_profit) {
					cnt++;
				} else if(A[j] - A[i] > max_profit) {
					max_profit = A[j] - A[i];
					cnt = 1;
				}
			}
		}
		System.out.println(cnt);
	}
}
