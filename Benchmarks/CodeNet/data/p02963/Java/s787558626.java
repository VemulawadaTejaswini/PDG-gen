import java.util.Scanner;

public class Main {

	public static final long MAX_POINT = 1000000000L;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();

		if(S <= MAX_POINT) {
			System.out.println(0 + " " + 0 + " " + 1 + " " + 0 + " " + 0 + " " + S);
		}else {
			long x3 = -1;
			long y3 = -1;
			while(x3 < 0 || y3 < 0) {
				y3 = (S / MAX_POINT) + 1;
				x3 = (MAX_POINT * y3) - S;
			}
			System.out.println(0 + " " + 0 + " " + MAX_POINT + " " + 1 + " " + x3 + " " + y3);
		}
	}

}
