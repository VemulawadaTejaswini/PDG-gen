import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		Map<Long,Long> sosuMap = new HashMap<Long,Long>();
		for(long i =2;i <= p;i++) {
			if(p % i == 0) {
				long sosuCount = 0;
				while(p % i == 0) {
					sosuCount++;
					p /= i;
					sosuMap.put((long) i, sosuCount);
				}
			}
		}

		long answer = 1;
		for(Map.Entry<Long, Long> entry:sosuMap.entrySet()) {
			if(entry.getValue() >= n) {
				answer *=Math.pow((double)entry.getKey(),(double)(entry.getValue() / n));

			}

		}

		System.out.println(answer);
	}

}