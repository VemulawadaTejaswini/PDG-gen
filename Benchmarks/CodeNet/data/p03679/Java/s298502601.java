import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		System.out.println(A-B>=0?"delicious":B-A<=X?"safe":"dangerous");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
