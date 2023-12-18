import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		int X =  a * b * b;
		int Y =  2 * x;
		
		double Z = (double) Y/X;
		
		double temp = Math.atan(Z);
		
		double ans = 90 - Math.toDegrees(temp);
		
		System.out.println(ans);

	}

}
