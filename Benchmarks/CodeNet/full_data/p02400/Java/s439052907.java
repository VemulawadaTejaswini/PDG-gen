import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;


public class Main{
	
	public static void main(String[] args){
		DoubleUnaryOperator s = D -> D * D * Math.PI;
		DoubleUnaryOperator t = D -> 2 * D * Math.PI;
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.printf("%f %f", s.applyAsDouble(r), t.applyAsDouble(r));
	}
	
}