import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int max = 0;
		int count = 0;
		String s;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list_ans = new ArrayList<String>();
		HashSet<String> list_record = new HashSet<String>();
		int[] list_count = new int[n];

		for(int i = 0;i < n;i++) {
			s = scan.next();

			if(!(list.contains(s))) {
				list.add(s);
				list_record.add(s);
			}else {
				count = list.indexOf(s);
				list_count[count] += 1;

				if(list_count[count] > max) {
					max = list_count[count];
				}
			}
		}

		for(int i = 0;i < list_record.size();i++) {
			if(list_count[i] == max) {
				list_ans.add(list.get(i));
			}
		}

		Collections.sort(list_ans);

		for(String ans : list_ans) {
			System.out.println(ans);
		}
	}
}