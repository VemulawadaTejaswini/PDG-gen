import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println((a+b)*h/2);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
