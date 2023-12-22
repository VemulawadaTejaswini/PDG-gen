import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		double b = input.nextDouble();
		double p = a*b;
		System.out.println((long)p);
	}
}
