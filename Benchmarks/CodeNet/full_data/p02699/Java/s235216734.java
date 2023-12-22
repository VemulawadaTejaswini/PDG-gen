import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double S = sc.nextDouble();
		double W = sc.nextDouble();
		if (S > W*2) 
			System.out.println("safe");
		else 
			System.out.println("unsafe");
	}
}