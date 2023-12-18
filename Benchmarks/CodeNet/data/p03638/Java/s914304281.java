import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[h*w];
		int counter = 0;
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < a; j++) {
				arr[counter++] = i;
			}
		}
		for(int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder(2*w+11);
			for(int j = 0; j < w; j++) {
				sb.append(arr[i*w+j]);
				if(j!=w-1) sb.append(' ');
			}
			if(i % 2 == 1) {
				sb = sb.reverse();
			}
			System.out.println(sb.toString());
		}
	}
}