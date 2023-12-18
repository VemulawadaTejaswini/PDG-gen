import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double w = in.nextInt();
		double h = in.nextInt();
		double x = in.nextInt();
		double y = in.nextInt();

		System.out.print(w*h/2 + " ");
		
		if( w/2.0 == x && h/2.0 == y ) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}

		in.close();
	}
}