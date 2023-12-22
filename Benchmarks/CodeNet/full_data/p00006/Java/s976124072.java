
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		String str=sc.next();
		StringBuilder s=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			s.append(str.charAt(i));
		}
		ln(s);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}