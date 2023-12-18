import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int res = 0;
		for (int i = 0; i < N; i++) {
			res = max(arr, i);
			System.out.println(res);
		}
	}

	static int max(int arr[], int index) {
		int max = 0;
		int new_arr[] = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			new_arr[k++] = arr[i];
		}
		// System.out.println(Arrays.toString(new_arr));
		Arrays.sort(new_arr);
		max = new_arr[arr.length - 2];

		return max;
	}

}