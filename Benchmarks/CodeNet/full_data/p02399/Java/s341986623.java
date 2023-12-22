import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = 1.0 * a / b;
		
		System.out.printf("%d %d %f",a/b,a%b,(double)a/b);
	}
}