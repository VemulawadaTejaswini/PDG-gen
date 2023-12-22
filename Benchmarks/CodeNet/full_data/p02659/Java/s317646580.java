import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		double B = input.nextDouble();
		B*=100;
		long b = (long)(B);
		long ans = A*b;
		ans/=100;
		System.out.println(ans);
	}	
}