import java.util.Scanner;

public class Odds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kisuu = (n + 1) / 2; 
		double ans = kisuu * 1.0 / n;
		System.out.println(ans);
		
	}

}