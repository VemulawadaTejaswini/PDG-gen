import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(b != 0){
			int d = a / b;
			int r = a % b;
			double f = (double)a / b;
			System.out.printf(d + " " + r + " " + f);
		}
	}
}