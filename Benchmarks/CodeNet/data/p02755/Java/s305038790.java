import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int A = in.nextInt();
		int B = in.nextInt();

		int answer=1;
		while(true) {
			int a = (int) (answer * 0.08);
			int b = (int) (answer * 0.1);
			if (b > 100) {
				System.out.println(-1);
				return;
			}

			if (a == A && b == B) {
				System.out.println(answer);
				return;
			}
			answer++;
		}

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}