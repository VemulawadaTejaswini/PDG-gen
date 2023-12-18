import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int max = 0;
		int min = 0;
		int ans = 100;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i ++) {
			ary.add(Integer.parseInt(sc.next()));
		}
		max = Collections.max(ary);
		min = Collections.min(ary);
		
		for(int i = min; i <= max; i++) {
			int x = 0;
			for(int y = 0;y < ary.size(); y++) {
				x += (ary.get(y) - i) * (ary.get(y) - i);
			}
			if(x <= ans) {
				ans = x;
			}
		}
		System.out.println(ans);
	}
}
