import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double dimension = N/3;
		System.out.println(dimension*dimension*dimension);
	}
}