import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextDouble();
		double res = a * a * b - x;
		double lrad = Math.atan(b / a);
		double rad = Math.atan(res * 2.0/ (a * a * a));
		double rad2 = Math.atan(b * b * a / (2.0 * x));
		if(lrad >= rad){
			System.out.println((rad * 180.0 / Math.PI));
		}else{
			System.out.println((rad2 * 180.0 / Math.PI));
		}
	}
}
