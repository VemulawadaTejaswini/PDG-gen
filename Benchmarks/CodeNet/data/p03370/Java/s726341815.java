import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, x;
	public void run(){
		n = sc.nextInt();
		x = sc.nextInt();
		solve();
	}
	public void solve(){
		int minm = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			if(minm > m) minm = m;
			
			x = x - m;
			ans = ans + 1;
		}
		
		ans += x / minm;
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}
