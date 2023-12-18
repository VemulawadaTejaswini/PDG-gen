import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long N = Long.parseLong(sc.next());
		long max = 0;
		for(long i=1;i<=N;i++) {
			long a = (A * i /B) - A * (i/B);
			max = Math.max(max, a);
		}
		System.out.println(max);

	}
}