
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int[] a = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		for (int i = N; i >= 2; i--) {
			//i以外のiの約数を探す
//			System.out.println("i:" + i);
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					list.add(j);
					if (j * j != i)
						list.add(i / j);
				}
			}
//			System.out.println(list);
			if (a[i] == 1) {
				for (int j : list) {
					a[j] = 1 - a[j];
				}
			}
		}

//		for(int i = 1;i <= N;i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();

		int sum = 0;
		for(int i = 1;i <= N;i++) {
			sum += a[i];
		}
		System.out.println(sum);
		for(int i = 1;i <= N;i++) {
			if(a[i] == 1) System.out.print(i + " ");
		}
		System.out.println();

	}
}
