import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		
		int ans = 0;
		
		for(int a = 1; a < N; a ++) {
			for(int b = 1; b < N; b ++) {
				if(a * b < N) {
					ans ++;
				}else {
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}