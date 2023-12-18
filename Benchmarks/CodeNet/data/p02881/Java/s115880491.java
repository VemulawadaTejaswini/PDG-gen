import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n = (long)Math.sqrt(N);

		if(n * n == N) {
			System.out.println(n);
		}else {
			while(n > 0) {
				n--;
				if(N % n == 0) {
					System.out.println(n + N/n - 2);
					break;
				}
			}
		}

		sc.close();
	}
}
