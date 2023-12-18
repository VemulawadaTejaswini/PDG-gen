import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		int[] a = new int[N];
		int[] b = new int[N];
		long x = 0;
		boolean y = false;
		String s = bufferedReader.readLine();
		String[] ss = s.split("[\\s]+");
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt((ss[i]));
			x += a[i];
		}
		s = bufferedReader.readLine();
		ss = s.split("[\\s]+");
		for (int i = 0; i < N; i++) {
			b[i] = Integer.parseInt((ss[i]));
			if (a[i] != b[i]) {
				y = true;
			}
			x -= b[i];
		}
		bufferedReader.close();
		if (x == 0 && y) {
			System.out.println("No");
			return;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				while (a[j] < b[j]) {
					a[i] += 2;
					b[j] += 1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (a[i] != b[i]) {
				System.out.println("No");
				return;
			}
			System.out.println("Yes");
		}
	}
}

