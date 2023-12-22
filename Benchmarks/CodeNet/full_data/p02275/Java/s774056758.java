import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[10000];
		int k = Integer.MIN_VALUE;
		int i = 0;
		for (String str : reader.readLine().split(" ")) {
			int num = Integer.parseInt(str);
			c[num]++;
			k = Math.max(k, num);
			a[i++] = num;
		}
		countingSort(a, b, c, k);
		System.out.println(Arrays.toString(b).replaceAll("[\\[\\],]", ""));
	}

	private static void countingSort(int[] a, int[] b, int[] c, int k) {
		for (int i = 1; i <= k; i++) {
			c[i] = c[i] + c[i - 1];
		}
		for (int i = a.length - 1; i >= 0; i--) {
			int num = a[i];
			b[c[num] - 1] = num;
			c[num]--;
		}		
	}
}

