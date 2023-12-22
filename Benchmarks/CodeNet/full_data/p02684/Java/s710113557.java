import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		int[] b = new int[n];
		List<Integer> list = new ArrayList<>();
		long sum = 0;

		for(int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			a[i] = ai;
		}

		b[0] = a[0];
		int index = a[0] - 1;
		k--;
		while(true) {
			if(b[index] == 0) {
				b[index] = a[index];
				k--;
				index = a[index] - 1;
			}else {
				k--;
				int index1 = index;
				int index2 = a[index] - 1;
				list.add(a[index]);
				while(index1 != index2) {
					list.add(a[index2]);
					sum++;
					index2 = a[index2] - 1;
				}
				sum++;
				k %= sum;
				break;
			}
		}

		System.out.println(list.get((int)k));

		sc.close();
	}
}