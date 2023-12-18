import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		long res = N + 1 - 2;
		for(long i = 1;i <=(long)Math.sqrt((double)N);i++) {
			if(N%i==0) {
				res = Math.min(res, i + N/i  -2);
			}
		}
		System.out.println(res);
	}
}