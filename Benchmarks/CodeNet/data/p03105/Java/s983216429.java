import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		int div = b/a;
		if(div >= c) {
			System.out.println(c);
		} else {
			System.out.println(div);
		}
		
	}
}
