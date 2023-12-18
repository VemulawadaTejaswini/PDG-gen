import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = (double)Integer.parseInt(sc.next());
		
		double answer = 2 * R * Math.PI;
		System.out.println(answer);
	}
}