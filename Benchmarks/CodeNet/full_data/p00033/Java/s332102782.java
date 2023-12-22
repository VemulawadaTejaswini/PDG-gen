import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		for (int i = 0; i < set; i++) {
			int[] ball = new int[10];
			int right = 0;
			int left = 0;
			boolean result = true;
			for (int j = 0; j < 10; j++) {
				ball[j] = sc.nextInt();
			}
			for (int k = 0; k < 10; k++) {
				if (ball[k] > right & ball[k] > left) {
					left = ball[k];
				} else if (ball[k] > right & ball[k] < left) {
					right = ball[k];
				} else if (ball[k] < right & ball[k] > left) {
					left = ball[k];
				} else if (ball[k] < right & ball[k] < left) {
					result = false;
				}
			}
			if (result == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}