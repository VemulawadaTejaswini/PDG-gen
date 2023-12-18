import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
