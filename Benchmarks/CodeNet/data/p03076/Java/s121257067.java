import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[5];
		int min = 1000;
		int min_i = 0;
		int B[] = new int[5];
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
			if(A[i] % 10 != 0) {
				if(min > A[i]) {
					min_i = i;
				}
				B[i] = 10 - (A[i] % 10);
			}
			//System.out.println(min_i);
		}
		
		int ans = 0;
		for(int i = 0; i < 5; i++) {
			if(min_i == i) {
				ans += A[i];
			} else {
				ans += A[i] + B[i];
			}
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
}
