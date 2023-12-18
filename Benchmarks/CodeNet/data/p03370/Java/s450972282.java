import java.util.Scanner;

public class Main {
	static int[] m;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		m = new int[n];

		min = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			if (x - m[i] > 0) {
				x -= m[i];
				count++;
			}
		}
		sc.close();
		getMin();
		while (x >= min) {
			x -= min;
			count++;
		}
		System.out.println(count);
	}

	public static void getMin() {
		
		min = m[0];
		for(int i = 1; i < m.length; i++) {
			if(m[i] < min) {
				min = m[i];
			}
		}
	}
}
