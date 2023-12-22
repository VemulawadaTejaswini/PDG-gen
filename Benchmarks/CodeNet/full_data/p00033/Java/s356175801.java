import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	static final String YES = "YES";
	static final String NO = "NO";

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int countDataset = sc.nextInt();
			int[] ballNums = new int[10];

			for (int i = 0; i < countDataset; i++) {
				for (int j = 0; j < 10; j++) {
					ballNums[j] = sc.nextInt();
				}

				System.out.println(push(ballNums) ? YES : NO);
			}
		} finally {
			sc.close();
		}
	}

	public static boolean push(int[] nums) {
		Deque<Integer> list1 = new LinkedList<Integer>();
		Deque<Integer> list2 = new LinkedList<Integer>();
		list1.add(0);
		list2.add(0);
		for (int number : nums) {
			if (list1.peek() < number) {
				list1.push(number);
			} else if (list2.peek() < number) {
				list2.push(number);
			} else {
				return false;
			}
		}
		return true;
	}
}