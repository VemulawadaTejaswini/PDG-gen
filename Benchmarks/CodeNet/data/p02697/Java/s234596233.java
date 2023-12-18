import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long N = in.nextLong();
		long M = in.nextLong();

//		if(M*2+1<= N) {
//		}else {
//			System.out.println("NG condition");
//			return;
//		}

//		Set<String> set = new HashSet<>();

		long a = 1;
		long b = N;
		for(int i=0;i<M;i++) {

//			System.out.println("===========");
//			for(int j=0;j<N;j++) {
//				int awork = a - j > 0 ? a -j : N + a - j;
//				int bwork = b - j > 0 ? b -j : N + b - j;
//				System.out.println(awork + " " + bwork);
//				if(!set.add(awork + " " + bwork)) {
//					System.out.println("!!NG!!");
//					return;
//				}
//			}

			System.out.println(a + " " + b);

			a++;
			b--;
		}


	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}