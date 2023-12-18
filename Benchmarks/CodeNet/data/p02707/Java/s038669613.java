import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			try {
				a[i] = sc.nextInt();
			} catch(NoSuchElementException e) {
				a[i] = 0;
			}
		}
		for (int j = 0; j < n; j++) {
			int count = 0;
			for (int k = 0; k < n; k++) {
				if (a[j] < a[k]) {
					count++;
				}
			}
			if (a[j] == 0) {
				System.out.println(0);
			} else {
				System.out.println(count);
			}
		}
	}
}