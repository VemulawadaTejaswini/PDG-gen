import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();

		int N = in.nextInt();
		String S = in.next();


		char[] cs = S.toCharArray();

		int cnt=0;
		for(int i=0; i<N-2;i++) {
			for(int j =i+1; j<N-1;j++) {
				for(int k=j+1; k<N;k++) {
					if (s.add(String.valueOf(new char[]{cs[i],cs[j],cs[k]}))) cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}