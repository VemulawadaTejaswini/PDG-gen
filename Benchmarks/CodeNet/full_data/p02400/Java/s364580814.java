
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args){
		double r;
		DecimalFormat t = new DecimalFormat("0.000000");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		r = r * r * 3.141592653589;
		System.out.println(t.format(r) + " " + t.format(r));
	}
}