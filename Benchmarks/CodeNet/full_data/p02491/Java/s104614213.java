import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt(); b = sc.nextInt();
		
		int d,r;
		float f;
		d = a / b;
		r = a % b;
		f = (float)a / (float )b;
		
		System.out.println(d + " " + r + " " + f);
	}
}