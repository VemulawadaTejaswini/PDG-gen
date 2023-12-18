import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int K = in.nextInt();


		int i = 0;
		long answer = 0; 

		for(long all=1;i<K;) {
			Optional<Long> next = isRunRun(all);
			if(next.isPresent()) {
				all = next.get();
			} else {
				i++;
				answer = all;
				all++;
			}
		}

		System.out.println(answer);
	}

	public static Optional<Long> isRunRun(long n) {
		boolean flg = false;
		char[] arr = Long.toString(n).toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			if (flg || Math.abs(arr[i] - arr[i+1]) > 1) { 
				flg = true;
				long x = (long)Math.pow(10, arr.length-2-i);
				long nn = (long)(n / x);
				return Optional.of((nn+1)*x);
			}
		}
		return Optional.empty();
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}