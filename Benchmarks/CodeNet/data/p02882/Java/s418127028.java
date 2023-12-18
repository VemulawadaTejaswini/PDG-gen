import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt(), b = scn.nextInt(), x = scn.nextInt();
		if(x <= a*a*b/2) {
			double h = (double)x/(double)(a*b);
			System.out.println(Math.atan2(h, b));
		}else {
			double h = (double)(a*b*a-x)/(double)(a*a);
			System.out.println(90.0-Math.atan2(h,a));
		}
	}

}
