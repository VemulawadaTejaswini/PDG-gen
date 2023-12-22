
import java.util.Scanner;

public class Main {

	static final double MIN = 1.0;
	static final double MAX = 10.0;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(true){
			double a = sc.nextDouble();
			if(a < MIN || MAX < a)	break;
			System.out.println(getSum(a));
		}
	}
	public static double getSum(double a){
		double sum = 0.0;
		sum = a * 633.0 / 81.0;
		return sum;
	}
}