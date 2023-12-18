import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		int dx = tx-sx;
		int dy = ty-sy;

		System.out.print(String.join("", Collections.nCopies(dy, "U")));
		System.out.print(String.join("", Collections.nCopies(dx, "R")));

		System.out.print(String.join("", Collections.nCopies(dy, "D")));
		System.out.print(String.join("", Collections.nCopies(dx, "L")));

		System.out.print("L"+String.join("", Collections.nCopies(dy+1, "U")));
		System.out.print(String.join("", Collections.nCopies(dx+1, "R"))+"D");

		System.out.print("R"+String.join("", Collections.nCopies(dy+1, "D")));
		System.out.print(String.join("", Collections.nCopies(dx+1, "L"))+"U");

		sc.close();
	}
}