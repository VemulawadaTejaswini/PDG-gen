import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			boolean b = isPrime(a);	
			if(b == true) {
				count++;
			}
		}
		System.out.println(count);
		
				
		sc.close();
	}
	
	boolean isPrime(int x) {
		if(x == 2) return true;
		else if(x < 2 || x % 2 == 0) return false;
		else {
			for(int i = 3; i <= Math.sqrt(x); i += 2) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
