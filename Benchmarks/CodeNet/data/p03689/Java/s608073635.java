import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		if(H%h==0) {
			if(W%w==0) {
				pw.println("No");
			} else {
				pw.println("Yes");
				int[] v = getArray(w);
				for(int i=0; i<H; i++) {
					for(int j=0; j<W; j++) {
						pw.print(v[j%w]);
						pw.print(j<W-1 ? " " : "\n");
					}
				}
			}
		} else {
			pw.println("Yes");
			int[] v = getArray(h);
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					pw.print(v[i%h]);
					pw.print(j<W-1 ? " " : "\n");
				}
			}
		}
		
		sc.close();
		pw.close();
	}
	
	static int[] getArray(int N) {
		int BASE = 1000;
		
		int[] ans = new int[N];
		Arrays.fill(ans, BASE);
		ans[N-1] = -(BASE*(N-1)+1);
		
		return ans;
	}
}
