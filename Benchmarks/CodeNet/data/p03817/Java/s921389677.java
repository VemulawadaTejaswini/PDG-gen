
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		long result = (x/11)*2;
		x %= 11;
		
		result += (int)Math.ceil(x / 6.);
		System.out.println(result);
	}

}
