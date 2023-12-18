import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("ABC"+n);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
