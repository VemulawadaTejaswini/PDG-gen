import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String n =sc.next();
		int m = Integer.parseInt(n);
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		int bangos[] = new int[m];
		for (int i=0;i<m;i++) {
			bangos[i] = Integer.parseInt(sc.next());
		}
		for (int i =0;i<bangos.length;i++) {
			map.put(bangos[i],i + 1 );
		}
		
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);

		String ans = "";
		for(int nKey : map.keySet()) {
			if(nKey == map.size()) {
				ans += map.get(nKey);
			}else {
				ans += map.get(nKey) + " ";
			}
		}
		
		System.out.println(ans);
	}
}
