import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();

		long l = A + B;

		long count = N / l;
		long answer = A * count;
		long amari = N % l;
		long a = amari - A;
		answer += a >= 0 ? A : A + a;
		System.out.println(answer);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}