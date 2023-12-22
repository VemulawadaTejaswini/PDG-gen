import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		double r = Double.parseDouble(sc.next());
		
		double area = r * r * Math.PI;
		double circumference = r * 2 * Math.PI;
		
		System.out.println(String.format("%.6f", area) +" " + String.format("%.6f",circumference ));
		sc.close();
	}

}

