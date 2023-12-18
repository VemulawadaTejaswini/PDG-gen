import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		int A = sn.nextInt();
		int B = sn.nextInt();
		
		System.out.println((B + A - 1) / A);
	}
	
}
