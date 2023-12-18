import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		boolean[] cut = new boolean[N];
		for(int i=0;i<M;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.put(b, a);
		}
		Arrays.sort(map.keySet().toArray());
		int now = 0;
		for (Integer key : map.keySet()){
			int a = map.get(key);
			if(a<=now) continue;
			count++;
			now = key-1;
		}
		System.out.println(count);
	}
}