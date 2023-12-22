import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] a;
	private int count;
	private int n, s;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			n = scan.nextInt();
			s = scan.nextInt();
			if ((n | s) == 0) break;
			
			a = new int[n];
			Arrays.fill(a, 0);
			
			count = 0;
			
			deep(0, 0, 0);
			
			System.out.println(count);
		}
	}
	
	private void deep(int b, int bn, int sum) {
		if (bn < n) {
			if (sum >= s) {
				//System.out.println("OUT");
				return;
			}else {
				for (int i = b; i < 10; i++) {
					//System.out.print("(" + (i+1) + ", " + (bn + 1) + ", " + (sum + i) + ")");
					deep(i+1, bn + 1, sum + i);
				}
			}
		}else {
			if (sum == s) {
				count++;
				//System.out.println("OK");
				return;
			}else {
				//System.out.println("OUT");
				return;
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}