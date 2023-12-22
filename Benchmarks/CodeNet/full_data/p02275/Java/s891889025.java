import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] a = new int[n];
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(strArray[i]);
			k = Math.max(k, a[i]);
		}
		int[] b = new int[n];
		countingSort(a, b, k);
		System.out.println(Arrays.toString(b).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", ""));
	}

	private static void countingSort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		int n = a.length;
		for (int i = 0; i < n; i++) {
			c[a[i]]++;
		}
		for (int i = 1; i <= k; i++) {
			c[i] = c[i] + c[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]]--;
		}
	}
}
