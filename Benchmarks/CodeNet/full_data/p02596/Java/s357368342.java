import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long K = stdIn.nextLong();
		long N = 0;
		long ans = 0;
		for(long i = 1; i <= K; i++){
			N = 7 + (N * 10);
			if(N % K == 0){
				ans = i;
				break;
			}
		}
		if(ans == 0){
			System.out.println(-1);
		}
		else{
			System.out.println(ans);
		}
		stdIn.close();
	}
}
