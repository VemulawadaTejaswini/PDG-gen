
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println((long)Math.ceil((-1 + Math.sqrt(1 + 8.0*x))/2));
	}

}
