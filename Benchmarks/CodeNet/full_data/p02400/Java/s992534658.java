import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String r = scan.nextLine();
		double rr = String.valueOf(r);
		double area = rr * rr * 3.14;
		double len = 2 * rr * 3.14;
		System.out.printf("%f %f\n", area, len);
		
	}
}