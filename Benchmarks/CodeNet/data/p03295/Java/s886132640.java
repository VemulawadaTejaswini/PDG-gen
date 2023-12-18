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
		for (Integer key : map.keySet()){
			int a = map.get(key);
			int flg = 1;
			for(int i=a;i<key;i++) if(cut[i]) flg = 0;
			if(flg==1){
				cut[key-1] = true;
				count++;
			}
		}
		System.out.println(count);
	}
}