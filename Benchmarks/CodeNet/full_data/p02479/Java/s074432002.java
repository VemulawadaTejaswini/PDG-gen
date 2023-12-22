import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			double r = scan.nextDouble();
			double S = Math.pow(r, 2) * Math.PI;
			double c = 2* r * Math.PI;
			System.out.printf("%f %f\n",S ,c);
		}finally{
			scan.close();
		}
	}
}