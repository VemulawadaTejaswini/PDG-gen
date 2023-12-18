import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();
		System.out.println("A"+b.charAt(0)+"C");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
