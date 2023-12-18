import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int N = in.nextInt();
		int K = in.nextInt();
		int C = in.nextInt();
		char[] S = in.next().toCharArray();

		Set<Integer> set = new HashSet<>();
		for(int i=0;i<N;i++) {
			set.add(i);
		}

		boolean flg = false;
		List<Integer> answers = new ArrayList<>(); 
		for(int i=0; i<N; i++) {
			if(S[i] == 'x') continue;

			S[i] = 'x';

			int cnt=0;
			for(int j=0;j<S.length;) {
				if(S[j] != 'x') {
					cnt++;
					j+=C+1;
				} else {
					j++;
				}
				if(cnt >= K) {
					break;
				}
			}

			if(cnt < K) {
				answers.add(i+1);
			} else {
				flg = true;
			}

			S[i] = 'o';
		}

		if(flg) {
			answers.forEach(System.out::println);
		}
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}