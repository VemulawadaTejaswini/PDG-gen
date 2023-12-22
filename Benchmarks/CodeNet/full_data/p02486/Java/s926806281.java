
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		while (true) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a == 0 && b == 0) {
				break;
			}
			list.add(new long[]{a, b});
		}
		for (long[] ary : list) {
			int count = 0;
			for (int i = 1; i <= ary[0]; i++) {
				for (int j = 1; j <= ary[0]; j++) {
					if (j == i) {
						continue;
					}
					for (int k = 1; k <= ary[0]; k++) {
						if (k == j || k == i) {
							continue;
						}
						if(i + j + k == ary[1]){
							count++;
						}
					}
				}
			}
			System.out.println(count/6);
		}
	}
}