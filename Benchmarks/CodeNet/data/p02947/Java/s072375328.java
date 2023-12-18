import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		List<Map<String, Integer>> mapList = new ArrayList<>();


		for (int i = 0; i < n; i++) {
			// Map<String, Integer> map =  new HashMap<>();
			String str = sc.next();
			String[] strArray = str.split("");
			Arrays.sort(strArray);

			String s = "";
			for(int j = 0;j<10;j++){
				String ss = strArray[j];
				s += ss;
			}
			list.add(str);
			slist.add(s);
		}

		long count = 0;

		Map<String, Long> map =  new HashMap<>();
		for (int i = 0; i < n; i++) {
			String is = slist.get(i);
			if(map.containsKey(is)){
				long currentV = map.get(is);
				if(currentV >0){
					count += currentV -1;
					map.put(is, currentV - 1);
				} else{
					map.remove(is);
				}
				continue;
			}

			long currentCount = 0;

			for(int j = i+1; j < n; j++){
				String js = slist.get(j);

				if(is.equals(js)){
					count++;
					currentCount++;
				}
			}

			map.put(is, currentCount);
			
		}

		System.out.print(count);
			
	}

	

}
