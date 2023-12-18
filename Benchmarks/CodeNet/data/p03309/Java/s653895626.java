import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long ans1= 0, ans2 = 0, ans3 = 0,average = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt()-i-1;
			average += A[i];
		}
		average /= N;
		for(int i = 0; i < N; i++)
			ans1 += Math.abs(A[i]-average);
		for(int i = 0; i < N; i++)
			ans2 += Math.abs(A[i]-average-1);
		for(int i = 0; i < N; i++)
			ans3 += Math.abs(A[i]-average+1);
		System.out.println(Math.min(ans1, Math.min(ans2, ans3)));
		
	}

}