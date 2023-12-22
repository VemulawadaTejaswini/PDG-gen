import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> Queue = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while (flag > 0) {
			String s = sc.next();
			if (s.equals("insert")) {
				int k = sc.nextInt();
				Queue.add(k);
			}
			else if (s.equals("extract")) {
				System.out.println(extractMax());
			}
			else {
				flag = 0;
			}
		}
	}
	
	public static int extractMax() {
		int max = 0,j = 0;
		for (int i = 0; i < Queue.size(); i++) {
			int tmp = Queue.get(i);
			if (tmp > max) {
				max = tmp;
				j = i;
			}
		}
		Queue.remove(j);
		return max;
	}

}
