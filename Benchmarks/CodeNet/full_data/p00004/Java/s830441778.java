
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			double a = stdIn.nextDouble();
			double b = stdIn.nextDouble();
			double c = stdIn.nextDouble();
			double d = stdIn.nextDouble();
			double e = stdIn.nextDouble();
			double f = stdIn.nextDouble();
			
			double x = (c - f/e)/(a - d/e);
			double y = (c - f/d)/(b - a/d);
			
			System.out.println(x+" "+y);
		}
	}
}