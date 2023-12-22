import java.util.*;

public class Main {
	
	public static int fib(int n, int a, int b) {
		if(n<1) return a;
		return fib(n-1, b, a+b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println( fib(n, 1 , 1) );
	}
	
}

