import java.util.Scanner;
import java.math.BigDecimal;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			BigDecimal in[] = new BigDecimal[8];
			for(int j = 0; j < 8; j++) {
				in[j] = sc.nextBigDecimal().setScale(BigDecimal.ROUND_UNNECESSARY);
			}

			/*
			for(int j = 0; j < in.length; j++) {
				System.out.println(in[j]);
			}
			// */

			BigDecimal m[] = new BigDecimal[2];
			for(int j = 0; j < 2; j++) {
				m[j] = in[2+4*j].subtract(in[0+4*j]).multiply(in[3+4*((j+1)%2)].subtract(in[1+4*((j+1)%2)]));
		//		System.out.println(m[j]);
			}

			if(m[0].equals(m[1]))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}