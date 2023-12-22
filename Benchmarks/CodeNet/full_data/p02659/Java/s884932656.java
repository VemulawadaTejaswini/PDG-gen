import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		float m = sc.nextFloat();
		m = m*n;
		System.out.println((long)m);
	}
}