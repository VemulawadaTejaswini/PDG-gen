import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i + 1;
			o.s = sc.next();
			o.p = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> {
			if (!o1.s.equals(o2.s)) {
				return o1.s.compareTo(o2.s);
			} else {
				return o2.p - o1.p;
			}
		});

		for (Obj o : arr) {
			System.out.println(o.i);
		}
	}

	static class Obj {
		String s;
		int i, p;
	}
}
