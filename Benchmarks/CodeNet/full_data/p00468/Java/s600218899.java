
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while(true){
			int n = Integer.parseInt(scan.next());
			int m = Integer.parseInt(scan.next());
			if(n==0) break;
			int[] a = new int[n];
			int[] b = new int[n];

			for (int i = 0; i < m; i++) {
				a[i] = Integer.parseInt(scan.next())-1;
				b[i] = Integer.parseInt(scan.next())-1;
			}
			int ans = 0;
			boolean[] used = new boolean[n];
			used[0]=true;
			for (int i = 0; i < m; i++) {
				if(a[i]==0){
					used[b[i]]=true;
					ans++;
				}
				if(b[i]==0){
					used[a[i]]=true;
					ans++;
				}
			}
			for (int i = 0; i < m; i++) {
				if((used[a[i]] && !used[b[i]]) || (used[b[i]] && !used[a[i]])) ans++;
			}

			out.println(ans);
		}
		out.flush();
	}
}