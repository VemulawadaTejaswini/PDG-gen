import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long N = Long.parseLong(sc.next());
		sc.close();


		long max = 0;
		long loop = N / B;

		if(B > N) {
			long s = (A * N) /B;
			long t = N / B;
			long tmp = s - A * t;
			if(max < tmp) {
				max = tmp;
			}
		}else {
				long maxX = B * 2 - 1;
				long s = (A * maxX) / B;
				long t = maxX / B;
				long tmp = s - (A * t);
				if(max < tmp) {
					max = tmp;
				}
			}
		System.out.println(max);
		}
}