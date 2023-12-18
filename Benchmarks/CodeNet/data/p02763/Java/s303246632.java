import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int N  = in.nextInt();
		char[] S = in.next().toCharArray();
		int Q = in.nextInt();

		List<Integer> answer = new ArrayList<>();
		for(int i=0;i<Q;i++) {
			int type = in.nextInt();
			if (type == 1) {
				int pos = in.nextInt();
				char target = in.next().charAt(0);
				S[pos-1] = target;
			} else {
				int l = in.nextInt();
				int r = in.nextInt();
				Set<Character> s = new HashSet<>();
				for (int j=l-1;j<r;j++) {
					s.add(S[j]);
				}
				answer.add(s.size());
			}
		}
		answer.forEach(System.out::println);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}