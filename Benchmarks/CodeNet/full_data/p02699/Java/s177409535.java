import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int s = sc.nextInt();
			int w = sc.nextInt();
			System.out.println(w >= s ? "unsafe" : "safe");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
