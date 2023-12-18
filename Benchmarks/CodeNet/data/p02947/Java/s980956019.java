import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count = 0;
		byte[][] array = new byte[n][26];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < 10; j++) {
				array[i][(int) (s.charAt(j) - 'a')]++;
			}
		}
		boolean[] flagArray = new boolean[n];
		Arrays.fill(flagArray, true);
		for (int i = 0; i < n - 1; i++) {
			List<Integer> index = new ArrayList<>();
			long tmpCount = 0L;
			for (int j = i + 1; j < n; j++) {
				if (!flagArray[j]) {
					continue;
				}
				boolean flag = true;
				for (int k = 0; k < array[i].length; k++) {
					if (array[i][k] != array[j][k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					index.add(j);
					++tmpCount;
				}
			}
			for (int num : index) {
				flagArray[num] = false;
			}
			if (tmpCount > 1) {
				tmpCount = (int) Math.pow(tmpCount, 2) - (int) Math.pow(tmpCount - 1, 2);
			}
			count += tmpCount;
		}
		System.out.println(count);
	}
}
