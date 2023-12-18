import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int A = in.nextInt();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < A; i++) {
			set.add(in.next());
		}


		System.out.println(set.size());

	}



	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}