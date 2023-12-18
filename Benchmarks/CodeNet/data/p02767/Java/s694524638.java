import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int R = 0;
		int J = 0;
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			R += X[i];
		}
		for(int i = 0; i < N; i++) {
			J += Math.pow(X[i],2);
		}
		int result = (int)Math.ceil(J - (Math.pow(R,2))/N);
		System.out.println(result);
	}
}