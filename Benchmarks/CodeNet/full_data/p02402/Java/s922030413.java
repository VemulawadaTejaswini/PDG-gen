import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int y = 0;
		int z = 0;
		long sum = 0;
		for(int i = 0; i < X; i++){
			int a = scan.nextInt();
			
			y = Math.min(y, a);
			z = Math.max(z, a);
			sum = sum + a;
		}
			System.out.println(y + " " + z + " " + sum);
	}

}