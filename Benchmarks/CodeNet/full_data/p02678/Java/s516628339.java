import java.util.*;
 
public class Main { 
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();

		for(int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> value = map.get(a);
			if(value == null) value = new ArrayList<>();
			value.add(b);
			map.put(a, value);
			List<Integer> value2 = map.get(b);
			if(value2 == null) value2 = new ArrayList<>();
			value2.add(a);
			map.put(b, value2);
		}
		int[] ans = new int[n+1];
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(1);
		while(dq.size() > 0){
			Integer i = dq.removeFirst();
			List<Integer> value = map.get(i);
			for(Integer j: value){
				if(ans[j] == 0){
					ans[j] = i;
					dq.add(j);
				}
			}
		}
		System.out.println("Yes");
		for(int i=2; i<=n; i++){
			System.out.println(ans[i]);
		}
	}
}
