import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int d = a / b;
		int r = a % b;
		double f = (double)a / b;
		
		System.out.println(d + " " + r + " " + String.format("%.5f", f));
	}
}	
