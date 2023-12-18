import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		long K = scanner.nextLong();
		long ans=0;

		for(int a=1;a<=K;a++) {
			for(int b=1;b<=K;b++) {
				for(int c=1;c<=K;c++) {
					ans+=gcd(a, gcd(b, c));
				}
			}
		}

		System.out.println(ans);
	}



	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}


}
