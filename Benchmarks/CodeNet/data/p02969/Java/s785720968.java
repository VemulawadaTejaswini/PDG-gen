import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(3*r*r);
		sc.close();
	}
}
