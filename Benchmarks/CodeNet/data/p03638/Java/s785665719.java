import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;

	static void solve() {
		int H = in.nextInt();
		int W = in.nextInt();
		int N = in.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		String S = "";
		for (int i = 1; i <= a.length; i++) {
			for(int j = 0; j < a[i-1]; j++){
				S += i;
			}
		}
		for (int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++){
				if (j != 0) {
					out.print(" ");
				}
				if(i % 2 == 0){
					out.print(S.charAt((W-1)*i+j));
				} else {
					out.print(S.charAt((W-1)*i+(W-1)-j));					
				}
			}
			out.println();
		}
		out.println();

	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
		in.close();
	}

}
