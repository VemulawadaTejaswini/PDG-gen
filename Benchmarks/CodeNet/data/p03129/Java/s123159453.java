import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sA();
	}
	
	void sA() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K * 2 - 1 <= N) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
