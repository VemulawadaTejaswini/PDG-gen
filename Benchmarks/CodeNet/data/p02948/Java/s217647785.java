import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int days = sc.nextInt();
		Map<Integer, List<Integer>> jobs = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < num; i++) {
			List<Integer> job = new ArrayList<Integer>();
			job.add(sc.nextInt());
			job.add(sc.nextInt());
			jobs.put(i, job);
		}
		sc.close();
		List<Integer> salary = new ArrayList<>();
		int output = 0;
		while (true) {

			int max = 0;
			int index = 0;
			int day = 0;
			boolean isFirst = true;
			for (int i = 0; i < num; i++) {
				if (jobs.containsKey(i)) {
					List<Integer> aList = jobs.get(i);
					if (isFirst) {
						isFirst = false;
						day = aList.get(0);
					}
					if (max < aList.get(1) && days >= aList.get(0) && day >= aList.get(0)) {
						max = aList.get(1);
						day = aList.get(0);
						index = i;
						days--;
						break;
					}
				}
			}
			salary.add(max);
			jobs.remove(index);
			if (max == 0) {
				for (int yen : salary) {
					output += yen;
				}
				break;
			}

		}
		System.out.println(output);

	}
}
