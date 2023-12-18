import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T[] = new long[N];
		long A[] = new long[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		
		long t = 1;
		long a = 1;
		for(int i = 0; i < N; i++) {
			if(T[i] < A[i]) {
				while(t % T[i] != 0 || a > t / T[i] * A[i]) t++;
				a = t / T[i] * A[i];
			} else {
				while(a % A[i] != 0 || t > a / A[i] * T[i]) a++;
				t = a / A[i] * T[i];
			}
		}
		System.out.println(t + a);
	}
}
