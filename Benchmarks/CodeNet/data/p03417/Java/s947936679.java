import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		int count = 1, ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(0 <= i-1 && 0 <= j-1) count++;
				if(0 <= i-1) count++;
				if(0 <= i-1 && j+1 < M) count++;
				if(0 <= j-1) count++;
				if(j+1 < M) count++;
				if(i+1 < N && 0 <= j-1) count++;
				if(i+1 < N) count++;
				if(i+1 < N && j+1 < M) count++;

				if(count % 2 == 1) ans++;
				count = 1;
			}
		}
		System.out.println(ans);
	}
}