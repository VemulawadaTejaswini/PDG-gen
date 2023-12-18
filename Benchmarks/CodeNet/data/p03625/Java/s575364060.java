import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		long[] arr = new long[N];
		long X = 0;
		long Y = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextLong();
		}
		Arrays.sort(arr);
		for (int i = N-1; i > 0; i--) {
			if (X == 0 && arr[i] == arr[i-1]) {
				X = arr[i];
				i--;
			}
			else if (X != 0 && arr[i] == arr[i-1]) {
				Y = arr[i];
				break;
			}
		}

		System.out.println(X*Y);
		reader.close();
	}


}



