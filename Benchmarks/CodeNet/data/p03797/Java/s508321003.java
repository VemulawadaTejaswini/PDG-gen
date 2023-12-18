import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if(N == 0) {
			System.out.println(M / 4);
		} else {
			System.out.println((N * 2 + M) / 4);
		}
	}
}
