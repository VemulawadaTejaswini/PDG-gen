import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == b)
			System.out.println(a * 2);
		else if (a < b)
			System.out.println(b + (b - 1));
		else
			System.out.println(a + (a - 1));
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
