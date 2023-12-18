import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long answer = 0;
		for(long i =0; i <= n;) {
			answer+= a;
			i += a;
			if(i > n) {
				answer -= (i -n);
			}
			i +=b;
		}
		System.out.println(answer);
	}
}