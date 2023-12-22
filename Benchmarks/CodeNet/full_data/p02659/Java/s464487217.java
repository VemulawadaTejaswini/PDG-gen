import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		
		double ans = 0;
		
		ans = n*m;
		ans = Math.floor(ans);
		
		System.out.println(ans);
		

	}
}
