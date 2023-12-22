import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();

		String answer="";
		boolean b = true;
		while(true) {
			if(b) {
				b = !b;
				C = C - B;
				if(C <= 0) {
					answer = "Yes";
					break;
				}
			} else {
				b = !b;
				A = A - D;
				if(A <= 0) {
					answer = "No";
					break;
				}
			}
		}

		System.out.println(answer);

	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}