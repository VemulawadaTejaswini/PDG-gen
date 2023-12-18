import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		
		int min = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			if(x - m[i] > 0) {
				x -= m[i];
				count++;
			}
		}
		sc.close();
		Arrays.sort(m);
		min = m[0];
		while(x >= min) {
			x -= min;
			count++;
		}
		System.out.println(count);
	}
}
