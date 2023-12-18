import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k = Integer.parseInt(scanner.next());

		ArrayList<String> sortList = new ArrayList<String>();
		String subs;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			ArrayList<String> tempList = new ArrayList<String>();
			for (int j = 0; j < n-i; j++) {
				subs = s.substring(i, i+j+1);
				tempList.add(subs);
			}
			sortList = mergeSortedList(sortList,tempList);
		}
		System.out.println(sortList.get(k - 1));
	}

	public static ArrayList<String> mergeSortedList(ArrayList<String> a, ArrayList<String> b) {
		ArrayList<String> c = new ArrayList<String>();
		int i = 0;
		int j = 0;
		int sizeA = a.size();
		int sizeB = b.size();
		// 如果a或b有一个遍历完了就停止
		while (i < sizeA && j < sizeB) {

			if (a.get(i).compareTo(b.get(j)) < 0) {
				c.add(a.get(i++)); // c[k] 赋值为 a[i]，先赋值再加1
			} else if (a.get(i).compareTo(b.get(j)) > 0) {
				c.add(b.get(j++));
			} else {
				c.add(a.get(i++));
				j++;
			}
		}
		// 如果 i < a.length，说明b都添加进数组c了，只剩下比b大的a，挨个添加就行
		while (i < sizeA) {
			c.add(a.get(i++));
		}
		while (j < sizeB) {
			c.add(b.get(j++));
		}
		return c;
	}
}