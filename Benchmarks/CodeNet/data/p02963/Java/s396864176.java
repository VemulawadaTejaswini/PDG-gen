import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		// System.out.prlongln(S);
		long x1 =1000000000;
		long x2 =1;
		long x3 =0;
		long y1 =0;
		long y2 =0;
		long y3 =0;
		System.out.println(S % 2);

		y2 = S / x1;
		y1 = (x1 * y2) - S;

		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);

	}
}