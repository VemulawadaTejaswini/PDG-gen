import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ans = fib(n);

		System.out.println(ans);

	}

	static int fib(int n) {

		if(n==0 || n==1) {

			return 1;

		}else {

			return fib(n-1) + fib(n-2);
		}

	}

}

