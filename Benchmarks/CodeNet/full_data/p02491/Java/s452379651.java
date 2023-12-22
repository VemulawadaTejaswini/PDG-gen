import java.io.*;
import java.util.*;

class Calc {
	int aaa(int a, int b) {
		return a / b;
	}
	
	int bbb(int a, int b) {
		return a % b;
	}
	
	double ccc(double a, double b) {
		return a / b;
	}
}

class Main {
		public static void main(String[] args) throws IOException {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String array[] = str.split(" ");
		int x[] = new int[array.length];
		for(int i=0; i<array.length; i++) {
			x[i] = Integer.parseInt(array[i]);
		}
		
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		Calc calc3 = new Calc();
		
		int a = calc1.aaa(x[0], x[1]);
		int b = calc2.bbb(x[0], x[1]);
		double c = calc3.ccc(x[0], x[1]);
		
		System.out.printf("%d %d %.5f\n", a,b,c);
		
	}
}