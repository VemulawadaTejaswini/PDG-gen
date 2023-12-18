import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		solve(N);
	}
	public void solve(int N) {
		for (int i = -120; i <120 ; i++) {
			for (int j = -120; j < 120; j++) {
				long ans = i*i*i*i*i - j*j*j*j*j;
				if (ans == N) {
					System.out.println(i +" " + j);
					return;
				}
			}
		}
		return;
	}
}