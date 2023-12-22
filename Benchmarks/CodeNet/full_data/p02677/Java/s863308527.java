
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double jiaoduH = h*360/12;
		double jiaoduM = m*360/60;
		if (jiaoduM > 0) {
			jiaoduH+= m * 1.0* 360 / (60 * 12);
		}
		double jiaodu = Math.abs(jiaoduM -jiaoduH);
		if (jiaodu > 180) {
			jiaodu = 360-jiaodu;
		}
		Double c = a*a + b*b - 2*a*b*Math.cos(jiaodu* (Math.PI)/180 );
		System.out.println(Math.sqrt(c));
	}

}
