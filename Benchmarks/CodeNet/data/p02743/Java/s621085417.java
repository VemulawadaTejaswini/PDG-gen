import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		if(a + b - c < -Math.sqrt(a * b * 2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
