import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn  =new Scanner(System.in);
		long N = scn.nextLong(),K = scn.nextLong();
		N = N%K;
		System.out.println(Math.min(N, K-N));
	}

}
