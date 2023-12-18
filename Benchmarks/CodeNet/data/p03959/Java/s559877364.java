import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] T = new int[N];
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		long res = 1;
		int[] placeholder = new int[N];
		int[] max = new int[N];
		
		Arrays.fill(placeholder, 0);
		Arrays.fill(max, 0);
		for (int i = 0; i < N; i++) {
			if (i==0) {
				placeholder[i] = T[i];
			}
			else {
				if (T[i]>T[i-1]) {
					placeholder[i] = T[i];
				}else {
					max[i] = T[i];
				}
			}
		}
		
		for (int i = N-1; i >=0; i--) {
			if (i==N-1) {
				placeholder[i] = A[i];
			}
			else {
				if (A[i]>A[i+1]) {
					if(max[i]!=0&&A[i]>max[i]) res=0;
					if(placeholder[i]!=0&&A[i]!=placeholder[i]) res = 0;
					placeholder[i] = A[i];
				}else {
					if (max[i]==0) {
						max[i] = A[i];
					}
					
				}
			}
		}
		
		if (res!=0) {
			for (int i = 0; i < N; i++) {
				if (placeholder[i]==0) {
					res*=max[i];
				}
			}
		}
		
		double divide = Math.pow(10, 9)+7;
		
		res = (long) (res%divide);
		
		System.out.println(res);
		
		
	}
}
