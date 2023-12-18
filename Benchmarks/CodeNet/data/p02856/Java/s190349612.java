import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt();
		long sumC = 0;
		long sumD = 0;
		for(int i=0;i < M;i++) {
			long d = scn.nextLong();
			long c = scn.nextLong();
			sumD += d*c;
			sumC += c + sumD/10;
			sumD %=10;
		}
		System.out.println(sumC-1);
	}

}
