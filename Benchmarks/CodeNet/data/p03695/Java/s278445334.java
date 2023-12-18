import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
  	Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		boolean[] a = new boolean[10];
		for(int i = 0; i < 10; i++) a[i] = false;
		int ans = 0, rest = 0;
		for(int i = 0; i < n; i++){
			int t = sc.nextInt();
			t /= 400;
			if(t >= 8){
				rest++;
				continue;
			}
			if(!a[t]){
				ans++;
				a[t] = true;
			}
		}
		sc.close();

		out.println(Math.max(1,ans) + " " + (ans + rest));
		out.flush();
	}
}