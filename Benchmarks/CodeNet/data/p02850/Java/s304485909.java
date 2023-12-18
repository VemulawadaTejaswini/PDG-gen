import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		List<Integer> resultList = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count =0;
		int before =0;
		for (int i=0;i<N-1;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			if (start != before) {
				count = 1;
				before = start;
			} else {
				count++;
			}
			if (map.get(start)!=null&&map.get(start)==count) {
				count++;
			}
			map.put(end, count);
			resultList.add(count);
			if (count>max ) {
				max = count;
			}
		}
		System.out.println(max);
		for (int i=0;i<resultList.size();i++) {
			System.out.println(resultList.get(i));
		}
	}
}