import java.util.Scanner;

public class Main {

	public static long floor(double num) {
		long result = (long)num;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();

		long ans = 0;
		long tmp = 0;
		for(int i = 0; i <= N; i++) {
			tmp = floor((double)A * i / B) - A*floor(i/(double)B);
			if(tmp > ans) {
				ans = tmp;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
