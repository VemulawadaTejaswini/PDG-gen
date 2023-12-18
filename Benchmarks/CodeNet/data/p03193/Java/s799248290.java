import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		int count =0;
		for (int i=0;i<A;i++) {
			long b= sc.nextLong();
			long c = sc.nextLong();
			if (B>=b&&C>=c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
