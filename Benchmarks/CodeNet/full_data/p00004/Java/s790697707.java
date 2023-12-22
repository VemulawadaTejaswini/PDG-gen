import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextInt()){
			float a = scan.nextFloat();
			float b = scan.nextFloat();
			float c = scan.nextFloat();
			float d = scan.nextFloat();
			float e = scan.nextFloat();
			float f = scan.nextFloat();

			float det = a*e - b*d;
			float x = (c*e - b*f)/det;
			float y = (-c*d+a*f)/det;

			System.out.print(String.format("%.3f", x) + " " + String.format("%.3f", y));
		}
	}
}