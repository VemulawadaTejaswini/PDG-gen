import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		long count = n / (a + b);
		long rem = n - count * (a + b);
		
		System.out.println(count * a + Math.min(rem, a));
	}
}