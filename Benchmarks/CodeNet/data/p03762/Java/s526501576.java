
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x_count = sc.nextInt();
		int y_count = sc.nextInt();

		long[] x_lines = new long[x_count];
		long[] y_lines = new long[y_count];

		for(int i = 0;i < x_count;i++){
			x_lines[i] = sc.nextLong();
		}
		for(int i = 0;i < y_count;i++){
			y_lines[i] = sc.nextLong();
		}

		long sum = 0;

		for(int left = 0; left < x_count - 1;left++){
			for(int right = left + 1;right < x_count;right++){
				for(int bottom = 0;bottom < y_count - 1;bottom++){
					for(int top = bottom + 1;top < y_count;top++){
						long width = x_lines[right] - x_lines[left];
						long height = y_lines[top] - y_lines[bottom];
						sum += width * height;
					}
				}
			}
		}

		System.out.println(sum % (1000000000 + 7));

		sc.close();
	}
}
