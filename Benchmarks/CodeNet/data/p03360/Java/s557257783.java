import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	public void run(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		solve(a, b, c, k);
	}
	public void solve(int a, int b, int c, int k){
		int ans = a + b + c;
		int t = a;
		if(t < b) t = b;
		if(t < c) t = c;
		
		ans = ans - t;
		
		for (int i = 0; i < k; i++){
			t = t * 2;
		}
		
		ans = ans + t;
		
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
