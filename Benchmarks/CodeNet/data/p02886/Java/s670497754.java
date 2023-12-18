import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int d[] = new int[N];
		for(int i = 0; i < N; i++){
			d[i] = stdIn.nextInt();
		}
		int ans = 0;

		for(int i = 0; i < N; i++){
			for(int j = i + 1; j < N; j++){
				ans += d[i] * d[j];
			}
		}
		System.out.println(ans);

		stdIn.close();
	}
}
