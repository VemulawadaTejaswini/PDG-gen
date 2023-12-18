import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = input.nextInt();
		int K = input.nextInt();
		int[] l = new int[N];
		int ans = 0;
		for(int i=0; i<l.length; i++){
			l[i] =input.nextInt();
		}
		Arrays.sort(l);
		for(int i=0; i<K; i++) {
			ans+=l[N-1-i];
		}
		out.println(ans);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}
