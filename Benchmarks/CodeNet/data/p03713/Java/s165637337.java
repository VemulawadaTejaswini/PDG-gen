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
		long h = sc.nextInt();
		long w = sc.nextInt();
		sc.close();
		long ans = Math.min(h,w);
		if(h % 3 == 0 || w % 3== 0){
			ans = 0;
		}
		for(long i = 1; i < h; i++){
			if(w % 2 == 0){
				ans = Math.min(ans, Math.max(i*w, (h-i)*(w/2)) - Math.min(i*w, (h-i)*(w/2)));
			}else{
				ans = Math.min(ans, Math.max(i*w, (h-i)*((w+1)/2)) - Math.min(i*w, (h-i)*((w-1)/2)));
			}
		}
		for(long i = 1; i < w; i++){
			if(h % 2 == 0){
				ans = Math.min(ans, Math.max(h*i, (w-i)*(h/2)) - Math.min(i*h, (w-i)*(h/2)));
			}else{
				ans = Math.min(ans, Math.max(h*i, (w-i)*((h+1)/2)) - Math.min(i*h, (w-i)*((h-1)/2)));
			}
		}
		out.println(ans);
		out.flush();
	}

	static class Pair{
		int a,b;
		public Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
}