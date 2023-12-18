import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int N  = in.nextInt();
		int M = in.nextInt();
		int[] answer = new int[N];
		for(int i=0;i<N;i++) {
			answer[i] = -1;
		}

		for(int i=0;i<M;i++) {
			int s = in.nextInt();
			int c = in.nextInt();

			// 一桁目が0
			if (s == 1 && c == 0) {
				System.out.println(-1);
				return;
			}

			// 矛盾した定義
			int a = answer[s-1];
			if(a != -1) {
				if (a != c) {
					System.out.println(-1);
					return;
				}
			}

			answer[s-1] = c;
		}

		if (answer[0] == -1) answer[0] = 1;
		for(int i=0;i<N;i++) {
			if (answer[i] == -1) answer[i] = 0;
		}

		for(int i=0;i<N;i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
	}
 
 
	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}