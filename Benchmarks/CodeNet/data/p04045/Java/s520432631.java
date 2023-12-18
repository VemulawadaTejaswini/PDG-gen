import java.util.*;

public class Main {
	static boolean[] arr;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new boolean[10];
		for (int i = 0; i < k; i++) {
			arr[sc.nextInt()] = true;
		}
		String s = String.valueOf(n);
		boolean flag = false; // 繰り上がりしているもの
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(i) - '0';
			if (flag) {
				total = total * 10 + getNumber(0);
			} else {
				int next = getNumber(x);
				if (next == -1) {
					int up = getNumber(total % 10 + 1);
					total += up - total % 10;
					total = total * 10 + getNumber(0);
					flag = true;
				} else {
					total = total * 10 + next;
					if (next != x) {
						flag = true;
					}
				}
			}
		}
		System.out.println(total);
	}
	
	// 指定した数値から最小の数値を得る（ない場合は、-1）
	static int getNumber(int start) {
		for (int i = start; i < 10; i++) {
			if (!arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
