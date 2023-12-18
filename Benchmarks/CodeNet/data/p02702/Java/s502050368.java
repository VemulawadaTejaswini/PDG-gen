import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int size = n.length();
		int[] sum = new int[size];
		int index = 0;
		while (index < size) {
			int x = n.charAt(index) - '0';
			sum[index] = x;
			index++;
		}
		int ans = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				int s = toInt(sum, i, j);
				if (s % 2019 == 0)
					ans++;
			}
		}
		System.out.println(ans);
	}
	public static int toInt(int[] sum, int i, int j) {
		int num = 0;
		for (int k = i; k <= j; k++) {
			num *= 10;
			num += sum[k];
		}
		return num;
	}
}