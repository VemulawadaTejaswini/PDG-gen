import java.util.Scanner;

public class Main {
	static int gray = 0;
	static int brown = 0;
	static int green = 0;
	static int sky = 0;
	static int blue = 0;
	static int yellow = 0;
	static int orange = 0;
	static int red = 0;
	static int other = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			color(a[i]);
		}
		
		int kind = sum();
		min = kind;
		max = kind + other;
		
		System.out.println(min + " "+ max);
	}
	
	public static void color(int x) {
		if (1 <= x && x < 400) {
			gray++;
		}
		else if (400 <= x && x < 800) {
			brown++;
		}
		else if (800 <= x && x < 1200) {
			green++;
		}
		else if (1200 <= x && x < 1600) {
			sky++;
		}
		else if (1600 <= x && x < 2000) {
			blue++;
		}
		else if (2000 <= x && x < 2400) {
			yellow++;
		}
		else if (2400 <= x && x < 2800) {
			orange++;
		}
		else if (2800 <= x && x < 3200) {
			red++;
		}
		else if (3200 <= x) {
			other++;
		}
		return;
	}
	public static int sum() {
		int kind = 0;
		if (gray >= 1) {
			kind++;
		}
		if (brown >= 1) {
			kind++;
		}
		if (green >= 1) {
			kind++;
		}
		if (sky >= 1) {
			kind++;
		}
		if (blue >= 1) {
			kind++;
		}
		if (yellow >= 1) {
			kind++;
		}
		if (orange >= 1) {
			kind++;
		}
		if (red >= 1) {
			kind++;
		}

		return kind;
	}
}
