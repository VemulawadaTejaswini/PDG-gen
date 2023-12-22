import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			int N = Integer.parseInt(input.nextLine());
			int cont = 0;
			for (int i = 1; i <= N; i++) {
				if(BigInteger.valueOf(i).isProbablePrime(200)) cont++;
			}
			System.out.println(cont);
			System.exit(0);
		}
	}
}