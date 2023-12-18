import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();
	public static final LinkedHashSet<String> set = new LinkedHashSet<>();

	public static void main(String[] args) {

		int N = in.nextInt();
		if(N==1) {
			System.out.println("a");
			return;
		}



		char[] c = new char[N];
		refresh(c,N);
		set.add(new String(c));
		for(int i=N-1;i>=0;i--) {
			refresh(c,N);
			w2(c, i, N);
		}


		set.stream().sorted().forEach(System.out::println);
	}

	public static void refresh(char[] c, int N) {
		for(int i=0;i<N;i++) c[i] = 'a';
	}

	public static void w(char[] c, int i, int N) {
		while(c[i] < c[i-1]+1) {
			c[i]++;
			set.add(new String(c));
			w2(c, i, N);
		}
		c[i] = 'a';
	}

	public static void w2(char[] c, int i, int N) {
		for(int j=N-1;j>i;j--) {
			if(j!=N-1) w2(c, j, N);
			w(c, j, N);
		}
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}