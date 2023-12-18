import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long Q = stdIn.nextLong();
		for(int i = 0; i < Q; i++) {
			long x = stdIn.nextLong();
			long d = stdIn.nextLong();
			long n = stdIn.nextLong();
			long ans = 1;
			for(int j = 0; j < n; j++) {
				ans *= x+d*j;
				if(ans >= 1000003) {
					ans = ans%1000003;
				}
			}
			System.out.println(ans);
		}

	}

}