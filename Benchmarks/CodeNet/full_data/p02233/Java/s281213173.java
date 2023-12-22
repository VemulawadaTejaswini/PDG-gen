import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] f = new long[n+1];

		System.out.println(Fib(n, f));

		scan.close();
		System.exit(0);
	}

	private static long Fib(int n, long[] f){
		f[0] = 1;
		f[1] = 1;
		if(f[n] != 0){
			for(int i = 2; i <= n; i++)
				f[n] = Fib(n-2, f) + Fib(n-1, f);
		}
		return f[n];
	}
}