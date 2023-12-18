import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int A[] = new int[N];
		int sum = 0;
		int ans = 0;

		for(int a = 0; a < N; a++){
			A[a] = stdIn.nextInt();
			sum += A[a];
		}

		for(int b = 0; b < N; b++){
			if(A[b] >= sum / 4.0 / M){
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