import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sC();
	}
	
	void sC() {
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long num = A;
		K -= A - 1;
		if(K % 2 != 0) {
			K--;
			num++;
		}
		if(B - A < 2) {
			num += K;
		}
		else {
			num += (long)(B - A) * (K / 2);
		}
		System.out.println(num);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
