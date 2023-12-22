import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		double B = input.nextDouble();
		B*=100.0;
		long alt = (long)(B);
		System.out.println(A*alt/100);
	}	
}