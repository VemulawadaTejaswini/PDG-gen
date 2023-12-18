import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] L = new int[N];
		for(int i = 0;i < N;i++){
			X[i] = sc.nextInt();
			L[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		for(int i = 0;i < N-1;i++){
			if((X[i+1] > X[i] && X[i+1] < X[i]+L[i]) ||
					(X[i+1] < X[i] && X[i+1] > X[i] - L[i])){
				cnt++;
			}
		}
		System.out.println(N-cnt);
	}
}