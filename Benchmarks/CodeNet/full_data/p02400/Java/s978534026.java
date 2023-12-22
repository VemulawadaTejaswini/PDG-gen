import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String r = scan.next();

		System.out.println(Double.parseDouble(r) * Double.parseDouble(r) * Math.PI + " " + (Double.parseDouble(r)+Double.parseDouble(r)) * Math.PI);


		scan.close();

	}
}