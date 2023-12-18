import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a%3==0||b%3==0||(a+b)%3==0?"Possible":"Impossible");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
