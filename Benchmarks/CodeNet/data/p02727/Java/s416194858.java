import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int R = input.nextInt();
		int G = input.nextInt();
		int C = input.nextInt();
		long[] arr = new long[R+G+C];
		long answer = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextLong();
		}
		Arrays.sort(arr);
		int cnt = 0;
		int index = R+G+C-1;
		while (cnt<X+Y) {
			answer+=arr[index];
			index--;
			cnt++;
		}
		System.out.println(answer);
	}
}