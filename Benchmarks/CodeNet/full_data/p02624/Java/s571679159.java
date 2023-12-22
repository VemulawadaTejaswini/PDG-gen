import java.util.*;

class Main {

	private static long[] slove(int N) {
		long[] divisor = new long[N + 1];
		Arrays.fill(divisor, 0);
		divisor[0] = 0;
		divisor[1] = 1;
		for (int i = 2; i <= N; i++) {
			int t = i;
			for (int j = i ; j <= N ; j += t){
				if (j <= N) {
					divisor[j]++;
				} else {
					break;
				}
			}
			long sqrt = (long) Math.sqrt(i) * (long) Math.sqrt(i);

			if (i == sqrt)
				divisor[i] = divisor[i] * 2 - 1;
			else
				divisor[i] *= 2;

		}
		return divisor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long divisor[] = slove(N),res=0;
		for (int i = 1; i <= N; i++) {
			res+=i*divisor[i];
		}
		System.out.println(res);
		sc.close();

	}

}