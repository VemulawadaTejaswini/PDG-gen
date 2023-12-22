import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> f = new ArrayList<Integer>();
		
		long ans = 0;
		
		for(int i = 1; i <= N; i ++) {
			long Y = (int) Math.floor((double) N / i);
			ans += Y * (Y + 1) * i / 2;
		}
		
		System.out.println(ans);
		
	}
}