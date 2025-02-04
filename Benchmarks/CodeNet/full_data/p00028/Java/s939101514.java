import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[101];
		while (sc.hasNext()) {
			a[sc.nextInt()]++;
		}
		
		int max = 1;
		for (int i = 1; i < 101; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		for (int i = 1; i < 101; i++) {
			if (a[i] == max) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}