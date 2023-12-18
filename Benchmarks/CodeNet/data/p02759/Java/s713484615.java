import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;

		double a = Double.parseDouble(sc.next());

		System.out.println((int)(Math.ceil(a/2.0)));

	}

}

