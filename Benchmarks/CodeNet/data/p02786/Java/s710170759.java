import java.util.*;

class Main {
	Scanner sc;
	long H;
	
	private void calc() {
		sc = new Scanner(System.in);
		H = sc.nextLong();
		long a = 0;
		long b = 1;
		while (H > 0) {
			H = H >>> 1;
			a += b;
			b = b << 1;
		}
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
