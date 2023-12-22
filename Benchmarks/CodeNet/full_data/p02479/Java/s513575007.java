import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		NumberFormat format=NumberFormat.getNumberInstance();
		format.setMaximumFractionDigits(10);
		double r=scanner.nextDouble();
		System.out.println(format.format(r*r*Math.PI)+" "+format.format(r*2*Math.PI));
	}
}