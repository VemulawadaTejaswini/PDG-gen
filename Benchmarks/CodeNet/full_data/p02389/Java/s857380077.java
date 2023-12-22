import java.util.*;
class Main{
	public static void main(String[] args) {
	     Main app = new Main();
             app.solve();
	}
	void solve(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a * b + " ");
		System.out.println(2 * (a + b));
	}
}
