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
			
			double y = (f*a - c*d)/(e*a - b*d);
			double x = (c - b*y)/a;
			System.out.printf("%.3f ",x);
			System.out.printf("%.3f\n",y);
		}
	}
}