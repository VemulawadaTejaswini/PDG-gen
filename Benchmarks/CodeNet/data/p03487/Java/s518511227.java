import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			if(map.containsKey(a))
				map.put(a, map.get(a)+1);
			else
				map.put(a, 1);
		}
		
		
		int r = 0;
		for(Map.Entry<Integer, Integer> m : map.entrySet()){
			int key = m.getKey();
			int cnt = m.getValue();
			
			if(cnt<key)
				r+=cnt;
			else if(cnt>key)
				r+=(cnt-key);
		}
		
		System.out.println(r);
	}

}
