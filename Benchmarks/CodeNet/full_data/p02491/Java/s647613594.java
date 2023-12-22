import java.util.Scanner;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		float a = cin.nextInt();
		float b = cin.nextInt();
		int ia = (int)a;
		int ib = (int)b;
		int d = (int)(a/b);
		int r = ia%ib;
		float f = a/b;
		DecimalFormat df1 = new DecimalFormat("###.000000");
		System.out.println(d+" "+r+" "+df1.format(f));
	}
}