import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		sc.close();
		double answer = A * B;
		prtln((long)answer);
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
