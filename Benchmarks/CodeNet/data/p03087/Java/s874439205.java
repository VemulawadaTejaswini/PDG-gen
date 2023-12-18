import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String str = sc.next();
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for(int i=0; i<Q; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			lists.add(list);
		}
		int[] nums = new int[Q];
		for(int i=0; i<lists.size(); i++) {
			List<Integer> tmp = lists.get(i);
			String sub = str.substring(tmp.get(0)-1, tmp.get(1));
			int cnt = 0;
			for(int j=0; j<sub.length(); j++) {
				int c = -1;
				c = sub.indexOf("AC");
				if(c!=-1) {
					sub = sub.substring(c+1);
					cnt++;
				}
			}
			nums[i] = cnt;
		}
		
		for(int i=0; i<Q; i++) {
			System.out.println(nums[i]);
		}
	}
}
