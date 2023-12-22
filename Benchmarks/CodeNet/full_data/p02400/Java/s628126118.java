import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%.8f %.8f", r * r * Math.PI, 2 * r * Math.PI);
	}
}
