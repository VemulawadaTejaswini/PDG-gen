import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int t=sc.nextInt();
		System.out.println(Math.max(0,x-t));
	}
}
