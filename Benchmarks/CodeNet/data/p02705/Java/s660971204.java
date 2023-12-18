import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			double R = scn.nextDouble();

			System.out.println((R+R)*Math.PI);
		}
	}
}