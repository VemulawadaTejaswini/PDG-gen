import java.util.Scanner;

public class Main {
	public static long sum = 0;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long n = 0;
		long m =0;
		while(cin.hasNext()){
			n = cin.nextLong();
			m = cin.nextLong();
			long p = m - n * 2;
			long k = p / 4;
			sum = k + n;
			System.out.println(sum);
		}
	}
}