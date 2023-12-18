import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt() - 1);
		sc.close();
		
		int cnt = 0;
		int button = 0;
		boolean[] pushed = new boolean[n];
		pushed[0] = true;
		
		while (true) {
			button = a[button];
			cnt++;
			
			if (pushed[button]) {
				System.out.println(-1);
				return;
			}
			
			if (button == 1) break;
			
		}
		System.out.println(cnt);
	}
}


