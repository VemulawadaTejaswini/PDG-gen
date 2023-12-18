import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a, b, c, d;
	public void run(){
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		solve();
	}
	public void solve(){
		if(Math.abs(c - a) <= d ){
			System.out.println("Yes");
		}
		else if(Math.abs(b - a) <= d &&Math.abs( c - b) <= d){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
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
