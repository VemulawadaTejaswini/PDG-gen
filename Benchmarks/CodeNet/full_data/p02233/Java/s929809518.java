import java.util.Scanner;

class Main {
	static int Fibonacci (int n) {
		
		if (n == 0 || n == 1) n = 1;
		else n = Fibonacci(n - 2) + Fibonacci (n - 1);
		return n;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println(Fibonacci (scan.nextInt()));
		scan.close();
		
	}
}

