
import java.util.Scanner;
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b && b < c) System.out.println("Yes");
		else System.out.println("No");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}

