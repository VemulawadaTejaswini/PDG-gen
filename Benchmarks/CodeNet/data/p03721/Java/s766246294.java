import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Map<Integer,Long> map = new HashMap<Integer,Long>();
		for(int i=0;i<n;i++){
			int ai = sc.nextInt();
			long bi = sc.nextLong();
			if(map.get(ai)!=null){
				bi += map.get(ai);
				map.remove(ai);
			}
			map.put(ai,bi);
		}
		int ans = 0;
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		for(Integer key : map.keySet()){
			long b = map.get(key);
			k -= b;
			ans = key;
			if(k<=0) break;
		}
		System.out.println(ans);
	}

}