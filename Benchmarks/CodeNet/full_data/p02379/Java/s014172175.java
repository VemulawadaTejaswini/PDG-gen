import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.########");
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double X;
		double Y;
		double p;
		
		p = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println(df1.format(p));
	}
}
