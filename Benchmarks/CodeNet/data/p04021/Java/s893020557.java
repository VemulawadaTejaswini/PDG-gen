import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Num[] arr = new Num[n];
		for (int i = 0; i < n; i++) {
			Num o = new Num();
			o.a = Integer.parseInt(br.readLine());
			o.i = i;
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr);

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].i % 2 != i % 2) {
				cnt++;
			}
		}
		System.out.println(cnt / 2);
	}

	static class Num implements Comparable<Num>{
		int a, i;
		public int compareTo(Num o) {
			return a - o.a;
		}
	}
}
