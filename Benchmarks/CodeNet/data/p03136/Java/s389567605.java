import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sB();
	}
	
	void sB(){
		int N = sc.nextInt();
		int L;
		int max = 0;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			L = sc.nextInt();
			sum += L;
			if(L > max) max = L;
		}
		if(sum - max <= max) System.out.println("No");
		else System.out.println("Yes");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
