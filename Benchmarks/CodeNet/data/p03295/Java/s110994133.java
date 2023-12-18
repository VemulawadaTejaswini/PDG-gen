import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main  implements Runnable {
	Random rnd = new Random();
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[][] a = new int[m][2];
		for (int i = 0; i < m; i++) {
			a[i][0] = Integer.parseInt(sc.next());
			a[i][1] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a, (aa, ab) -> Integer.compare(ab[1], aa[1]));
		Arrays.parallelSort(a, (aa, ab) -> Integer.compare(aa[0], ab[0]));
		int ans = 0;
		int ca = 0;
		int cut = 0;
		for (int i = 0; i < m; i++) {
			if(cut < a[i][0])
			{
				ca = a[i][0];
				ans++;
				cut = a[i][1]-1;
			}
			else if(cut > a[i][1]-1){
				cut = a[i][1]-1;
			}
		}
		out.println(ans);
		out.flush();
	}
}