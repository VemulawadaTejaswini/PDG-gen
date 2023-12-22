import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {


		int K = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();

		for(int i=A;i<B+1;i++) {
			if (i%K==0) {
				System.out.println("OK");
				return;
			}
		}
		
		String answer = "NG";
		System.out.println(answer);
	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}