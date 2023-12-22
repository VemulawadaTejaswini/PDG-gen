import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(in.readLine());
		System.out.printf("%.6f %.6f%n",r*r*Math.PI,2.0*r*Math.PI);
	}
}