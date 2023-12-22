
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		for(int i=1;i<=9;i++)for(int j=1;j<=9;j++){
			ln(String.format("%dx%d=%d",i,j,i*j));	
		}
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