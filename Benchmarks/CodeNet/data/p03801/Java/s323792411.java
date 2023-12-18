import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n + 1];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Obj o = new Obj();
		o.i = n;
		o.a = 0;
		arr[n] = o;

		Arrays.sort(arr, (o1, o2) -> {
			if (o1.a != o2.a) {
				return o2.a - o1.a;
			}
			return o2.i - o1.i;
		});

		long[] ans = new long[n];
		int idx = n;
		int size = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			size++;
			Obj o1 = arr[i];
			Obj o2 = arr[i + 1];
			if (o1.a > o2.a) {
				idx = Math.min(idx, o1.i);
				ans[idx] += (long) (o1.a - o2.a) * size;
			}
		}

		Arrays.sort(arr, (o1, o2) -> o1.i - o2.i);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static class Obj {
		int i, a;
	}
}
