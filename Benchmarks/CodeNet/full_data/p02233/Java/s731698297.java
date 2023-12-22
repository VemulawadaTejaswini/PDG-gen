import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		System.out.println(fib(n));
	}

	static int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n-1) + fib(n-2);	
	}
}