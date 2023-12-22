import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String temp;
		double r;
		try{
			temp = scan.next();
			r = Double.parseDouble(temp);
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		System.out.printf("%f %f%n", Math.PI * r * r, 2 * Math.PI * r);
		return;
	}
}