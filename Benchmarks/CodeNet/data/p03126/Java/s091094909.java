import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
      
		List<String[]> arrList = new ArrayList<>(); 
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
          	if("".equals(s)){
              continue;
            }
			arrList.add(s.split(" "));
		}
		sc.close();

		Map<Integer, Integer> ansMap = new HashMap<>();
		for(int j=1; j<=m; j++) {
			ansMap.put(Integer.valueOf(j), Integer.valueOf(0));
		}
		for(String[] strArr : arrList) {
			makeMap(ansMap, strArr);
		}
		
		int ans = 0;
		for(Map.Entry<Integer, Integer> entry : ansMap.entrySet()) {
			if (entry.getValue() == n) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	private static void makeMap(Map<Integer, Integer> ansMap, String[] arr) {
		int size = Integer.parseInt(arr[0]);
		for(int i=1; i<=size; i++) {
			Integer key = Integer.parseInt(arr[i]);
			int a = ansMap.get(key).intValue();
			ansMap.put(key, Integer.valueOf(a+1));
		}
	}
}
