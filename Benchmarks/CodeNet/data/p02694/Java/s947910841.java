import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {


		long X = in.nextLong();


		long A = 100;
		long i=0;
		while(A<X){
			i++;
			A *= 1.01;
		}

		System.out.println(i);
	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}