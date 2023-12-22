import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int array[];
	public static void main(String args[]) {
		new Main().run();
	}
	Main() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
	}
	void run() {
		Arrays.sort(array);
		for (int i = 0; i < n; i++) {
			System.out.print((i==0?"":" ") + array[i]);
		}
		System.out.println();
	}
}

