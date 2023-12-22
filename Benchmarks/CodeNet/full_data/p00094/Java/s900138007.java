import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		int area=a*b;
		double tubo=3.305785;
		
		double ans = area/tubo;
		
		System.out.println(ans);
		

	}
}

