import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		boolean judge = false;
		HashSet<Integer> list = new HashSet<Integer>();

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		TreeSet<Integer> sorted_list = new TreeSet<Integer>();
		ArrayList<Integer>list_judge = new ArrayList<Integer>();
		sorted_list.addAll(list);
		list_judge.addAll(sorted_list);

		if(list.size() == 1) {
			System.out.println(count);
		}else {
			for(int i = 0;i < list.size();i++) {
				for(int j = 0;j < i;j++) {
					if(list_judge.get(i) % list_judge.get(j) == 0) {
						judge = true;
						break;
					}
				}

				if(judge) {
				}else {
					count += 1;
				}
				judge = false;
			}

			System.out.println(count);
		}
	}
}
