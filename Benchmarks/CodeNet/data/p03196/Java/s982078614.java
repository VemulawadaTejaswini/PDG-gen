import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = sc.nextLong();
		List<Long> sosuList = new ArrayList<Long>();
		for(int i =2;i <= p;i++) {
			if(i == p) {
				sosuList.add(p);
				break;
			}
			if(p % i == 0) {
				sosuList.add((long) i);
				p /= i;
				i =1;
			}
		}
		Collections.sort(sosuList);
		Map<Long,Long> sosuMap = new HashMap<Long,Long>();
		long sosuCount = 0;
		for(int i =0;i < sosuList.size();i++) {
			if(i ==0) {
				sosuCount++;
				continue;
			}
			if(sosuList.get(i) == sosuList.get(i-1)) {
				sosuCount++;

			}else {
				sosuMap.put(sosuList.get(i-1), sosuCount);
				sosuCount =1;
			}
			if(i == sosuList.size()-1) {
				sosuMap.put(sosuList.get(i), sosuCount);
			}
		}
		long answer = 1;
		for(Map.Entry<Long, Long> entry:sosuMap.entrySet()) {
			if(entry.getValue() >= n) {
				answer *= (entry.getKey() * (entry.getValue() / n));
			}

		}

		System.out.println(answer);
	}

}