import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long K=sc.nextLong();
		int sz=0;
		while(N>0) {
			N/=K;
			++sz;
		}
		System.out.println(sz);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
