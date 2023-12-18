import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int A[] = new int[N];
		int sum = 0;
		int f = 0;
		int ans = 0;

		for(int a = 0; a < N; a++){
			A[a] = stdIn.nextInt();
			sum = sum + A[a];
		}
		f = sum / 4 / M;

		for(int b = 0; b < N; b++){
			if(A[b] > f){
				ans++;
			}
		}
		if(ans >= M){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}