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
		a=a.toUpperCase();
		b=b.toUpperCase();
		c=c.toUpperCase();
		System.out.println(a.charAt(0)+""+b.charAt(0)+""+c.charAt(0));
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
