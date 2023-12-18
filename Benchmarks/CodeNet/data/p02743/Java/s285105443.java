import java.util.*;
import java.io.*;

public class CNN {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		if((double)((double)Math.sqrt(a) + (double)Math.sqrt(b)) < (double)Math.sqrt(c)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
