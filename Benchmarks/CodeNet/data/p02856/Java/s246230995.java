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
			sumC += c;
			while(sumD >10) {
				long buf = 0;
				sumC += sumD/10;
				while(sumD>0) {
					buf+= sumD%10;
					sumD/=10;
				}
				sumD = buf;
			}
		}
		System.out.println(sumC-1);
	}

}
