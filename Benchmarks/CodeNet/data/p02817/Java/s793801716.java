
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		System.out.println(t+s);
		sc.close();
	}
}
