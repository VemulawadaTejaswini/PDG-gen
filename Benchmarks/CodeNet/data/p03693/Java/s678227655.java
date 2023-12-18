import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		int v=100*r+10*g+b;
		System.out.println(v%4==0?"YES":"NO");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
