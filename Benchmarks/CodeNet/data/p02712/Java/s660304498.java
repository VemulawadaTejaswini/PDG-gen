import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {

		long N = in.nextLong();
		long sum=0;
		for(long i=1;i<N+1;i++) {
			if(i % 3 == 0 || i % 5 == 0) {
			}else {
				sum += i;
			}
		}

		System.out.println(sum);

	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}