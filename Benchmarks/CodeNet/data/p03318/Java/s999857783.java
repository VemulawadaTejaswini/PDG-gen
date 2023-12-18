import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long i = 1, j = 0;
		while(j < k) {
			if(i * func(i + 1) <= (i + 1) * func(i) && i * func(i + 10) <= (i + 10) * func(i)) {
				j++;
				System.out.println(i);
			}
			i++;
		}
	}

	static long func(long x) {
		long ret = 0;
		while(x > 0) {
			ret += x % 10;
			x /= 10;
		}
		return ret;
	}

}
