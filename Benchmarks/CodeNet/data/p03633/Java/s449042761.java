import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long T[] = new long[N];

		for (int i=0; i<N; i++){
			T[i] = sc.nextLong();
		}

		long tmp;

		tmp = T[0];
		for (int i=1; i<N; i++){
			tmp = lcm(tmp, T[i]);
		}
		System.out.println(tmp);
	}

	public static final long gcd(final long a, final long b){
		return (b == 0) ? a : gcd(b, a % b);
	}

	public static final long lcm(final long a, final long b){
		long gcd = gcd(a,b);
		return (a / gcd) * b ;
	}
}

