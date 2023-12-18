import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double S = sc.nextDouble();
		double W = sc.nextDouble();
		if (W >= S/2) 
			System.out.println("unsafe");
		else 
			System.out.println("safe");
	}
}