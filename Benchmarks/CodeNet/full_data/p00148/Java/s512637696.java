import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (; sc.hasNextInt();) {
			int n = sc.nextInt();
			System.out.printf("3C%02d\n", ((n-1)%39 + 1));
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}