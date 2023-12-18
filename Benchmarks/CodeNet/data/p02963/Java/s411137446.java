import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		// System.out.prlongln(S);
		long x1 =0;
		long x2 =1;
		long x3 =0;
		long y1 =1;
		long y2 =2;
		long y3 =0;
		x1 = (S + (x2 * y1)) / y2;


		// if (S % 2 != 0){
		// 	y2 = 3;
		// }
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);


	}
}