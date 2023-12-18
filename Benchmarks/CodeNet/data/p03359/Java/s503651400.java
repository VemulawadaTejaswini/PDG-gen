import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	public void run(){
		int a = sc.nextInt();
		int b = sc.nextInt();
		solve(a, b);
	}
	public void solve(int a, int b){
		int ans = a;
		if(a > b){
			ans = a - 1;
		}
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
