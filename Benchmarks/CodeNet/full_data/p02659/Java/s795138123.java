import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		 double B = sc.nextDouble();
		double ab = Math.floor(A * B);
		long a = (long) ab;
		System.out.println(a);
	}

}
