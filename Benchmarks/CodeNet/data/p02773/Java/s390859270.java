import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int max = 0;
		String s;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list_ans = new ArrayList<String>();
		HashSet<String> list_record = new HashSet<String>();
		ArrayList<Integer> list_count = new ArrayList<Integer>(n);

		for(int i = 0;i < n;i++) {
			list_count.add(0);
		}

		for(int i = 0;i < n;i++) {
			s = scan.next();

			if(!(list_record.contains(s))) {
				list.add(s);
			}
			list_record.add(s);

			if(list_record.contains(s)) {
				list_count.set(list.indexOf(s) , list_count.get(list.indexOf(s)) + 1);

				if(list_count.get(list.indexOf(s)) > max) {
					max = list_count.get(list.indexOf(s));
				}
			}
		}

		for(int i = 0;i < list.size();i++) {
			if(list_count.get(i) != max) {
				list_record.remove(list.get(i));
			}
		}

		for(String word : list_record) {
			list_ans.add(word);
		}

		Collections.sort(list_ans);

		for(String ans : list_ans) {
			System.out.println(ans);
		}
	}
}