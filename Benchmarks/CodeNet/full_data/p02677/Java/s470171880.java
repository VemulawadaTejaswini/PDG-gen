import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int A = scanner.nextInt();
 		int B = scanner.nextInt();
 		int H = scanner.nextInt();
 		int M = scanner.nextInt();
 		double cos = 0;
 		double result = 0;

 		double h = H * 30 + M * 0.5;
 		double m = M * 6;
 		if (h >= m) {
 			cos = Math.cos(Math.toRadians(h-m));
 		} else {
 			cos = Math.cos(Math.toRadians(m-h));
 		}
 		result = A*A + B*B - 2*A*B*cos;
 		result = Math.pow(result, 0.5);
 		//System.out.println(h);
 		//System.out.println(m);

 		System.out.println(result);
 	}
 }