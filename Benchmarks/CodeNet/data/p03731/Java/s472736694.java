
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long T = scan.nextLong();
		long[] t = new long[N];
		for(int i = 0; i < N; i++) {
			t[i] = scan.nextLong();
		}
		long X = 0;
		for(int i = 1; i < N; i++) {
			if(t[i] - t[i - 1] >= T) {
				X += T;
			} else {
				X += t[i] - t[i - 1];
			}
		}
		X += T;
		
		System.out.println(X);
		scan.close();
	}

}
