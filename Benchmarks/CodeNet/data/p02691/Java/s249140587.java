import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long[] heightArray = new long[n];

		for (int i = 0; i < n; i++) {
			heightArray[i] = stdIn.nextLong();
		}

		Map<Long, Integer> formerCntMap = new HashMap<>();

		for (int i = 0; i < heightArray.length; i++) {

			if(heightArray[i] > n) {
				continue;
			}


			long fValue = i + heightArray[i];
			if(!formerCntMap.containsKey(fValue)) {
				formerCntMap.put(fValue, 1);
			} else {
				formerCntMap.replace(fValue, formerCntMap.get(fValue)+1);
			}

		}


		int cnt = 0;
		for (int i = 0; i < heightArray.length; i++) {
			long lValue = i - heightArray[i];

			if(formerCntMap.containsKey(lValue)) {
				cnt += formerCntMap.get(lValue);
			}
		}

		System.out.println(cnt);

		stdIn.close();

	}

}