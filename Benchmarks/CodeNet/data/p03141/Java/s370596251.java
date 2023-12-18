import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Ryouri[] array = new Ryouri[n];
		for (int i = 0; i < n; i++) {
			Ryouri r = new Ryouri(sc.nextInt(), sc.nextInt());
			array[i] = r;
		}
		sc.close();

		// vの降順
		Arrays.sort(array, new Comparator<Ryouri>() {
			public int compare(Ryouri r1, Ryouri r2) {
				return r2.v - r1.v;
			}
		});

		long sumA = 0L;
		long sumB = 0L;
		boolean oddFlg = true;
		for (int i = 0; i < n; i++) {
			if (oddFlg) {
				sumA += array[i].a;
			} else {
				sumB += array[i].b;
			}
			oddFlg = !oddFlg;
		}
		System.out.println(sumA - sumB);
	}

	static class Ryouri {
		int a;
		int b;
		int v;
		public Ryouri(int a, int b) {
			this.a = a;
			this.b = b;
			this.v = a + b;
		}
	}
}
