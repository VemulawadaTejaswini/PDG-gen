import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int r;
	public void run() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		System.out.println(r*r);
		sc.close();
	}
}