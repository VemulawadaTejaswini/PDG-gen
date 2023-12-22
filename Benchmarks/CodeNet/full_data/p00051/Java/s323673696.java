import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i=0; i<n; ++i){
			int V = 0, M = 1000000000;
			
			char[] str = sc.next().toCharArray();
			Arrays.sort(str);
			char[] rts = new char[str.length];
			for(int j=0; j<str.length; ++j){
				rts[j] = str[str.length - j -1];
			}
			
			int v = Integer.parseInt(new String(rts));
			int m = Integer.parseInt(new String(str));
			V = Math.max(v, V);
			M = Math.min(m, M);
			
			System.out.println(Math.abs(V-M));
		}
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}