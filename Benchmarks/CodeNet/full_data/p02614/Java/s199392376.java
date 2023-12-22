import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static int countWays;

	static int findWays(ArrayList<Integer> arL, int i, int toMake, int curSum) {
		if (curSum == toMake) {
			return 1;
		} else if (i >= arL.size())
			return 0;
		else if (curSum > toMake)
			return 0;
		return findWays(arL, i + 1, toMake, curSum) + findWays(arL, i + 1, toMake, curSum + arL.get(i));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		StringBuilder ans = new StringBuilder();
//		while (--t >= 0) {
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), rows[] = new int[n], cols[] = new int[m],
				totalBlack = 0;
		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			for (int j = 0; j < m; j++) {
				char tempChar = temp.charAt(j);
				if (tempChar == '#') {
					++rows[i];
					++cols[j];
					++totalBlack;
				}
			}
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			nums.add(rows[i]);
		for (int i = 0; i < m; i++)
			nums.add(cols[i]);
		int toMake = totalBlack - k;
		if (toMake == 0)
			System.out.println(1);
		else if (toMake < 0)
			System.out.println(0);
		else
			System.out.println(findWays(nums, 0, toMake, 0));
	}
}
//}
