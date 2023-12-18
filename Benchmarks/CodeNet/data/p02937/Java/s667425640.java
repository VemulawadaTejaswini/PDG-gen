import java.util.*;
public class Main {

	public static int upperbound(List<Integer> a, int key) {
		if(a.get(a.size()-1) <= key)
			return a.size();
		int lb = 0, ub = a.size()-1, mid;
		do {
			mid = (ub+lb)/2;
			if(a.get(mid) <= key)
				lb = mid + 1;
			else
				ub = mid;
		}while(lb < ub);
		return ub;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		Map<Integer, List<Integer>> sa = new HashMap<>();
		boolean[] ta = new boolean[26];
		for(int i = 0; i < 26; i++)
			sa.put(i, new ArrayList<Integer>());
		for(int i = 0; i < s.length(); i++) {
			sa.get(s.charAt(i)-'a').add(i);
			sa.get(s.charAt(i)-'a').add(i+s.length());
		}
		for(int i = 0; i < t.length(); i++)
			ta[t.charAt(i)-'a'] = true;
		for(int i = 0; i < 26; i++) {
			Collections.sort(sa.get(i));
			if(ta[i] && sa.get(i).size() == 0) {
				System.out.println(-1);
				return;
			}
		}
		long ans = 0;
		int point = -1;
		for(int i = 0; i < t.length(); i++) {
			int x = sa.get(t.charAt(i)-'a').get(upperbound(sa.get(t.charAt(i)-'a'), point));
			System.out.println("x:"+x+" p:"+point);
			ans += x-point;
			point = x % s.length()+1;
		}
		System.out.println(ans);

	}

}