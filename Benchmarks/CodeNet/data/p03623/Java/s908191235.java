import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(Math.abs(x-a)<Math.abs(x-b)) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
