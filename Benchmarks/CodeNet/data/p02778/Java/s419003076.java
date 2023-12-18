import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0; i<s.length(); i++) {
			System.out.print("x");
		}
		System.out.println();
		sc.close();
	}
}
