import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a/b;
		int r = a%b;
		 DecimalFormat df1 = new DecimalFormat("0.00000");
		double a2 = a;
		double b2 = b;
		double f = a2/b2;
		System.out.println(d +" "+ r +" "+ df1.format(f));
	}
}