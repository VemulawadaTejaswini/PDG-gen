import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int[] Hb = new int[H];
		int[] Wb = new int[W];
		String[] graph = new String[H];
		int total = 0;
		for (int i = 0; i < H; i++) {		
			String s = sc.next();
			graph[i] = s;
			char[] c = s.toCharArray();
			for (int j = 0; j < W; j++) {
				if (c[j] == '#') {
					Hb[i]++;
					total++;
				}
			}
		}
		for (int i = 0; i < W; i++) {
			for (String s : graph) {
				if (s.toCharArray()[i] == '#') {
					Wb[i]++;
				}
			}
		}
		List<List<Integer>> Hnum = new ArrayList<>();
    	for (int i = 1; i < Math.pow(2, H); i++) {
    		List<Integer> num = new ArrayList<>();
    		for (int j = 0; j < H; j++) {
    			if (((i>>j)&1) == 1) {
    				num.add(j);
    			}
    		}
    		Hnum.add(num);
    	}
		List<List<Integer>> Wnum = new ArrayList<>();
    	for (int i = 1; i < Math.pow(2, W); i++) {
    		List<Integer> num = new ArrayList<>();
    		for (int j = 0; j < W; j++) {
    			if (((i>>j)&1) == 1) {
    				num.add(j);
    			}
    		}
    		Wnum.add(num);
    	}
    	int ans = 0;
    	for (int i = -1; i < Hnum.size(); i++) {
    		int score = total;
    		if (-1 < i) {
    			List<Integer> Hp = Hnum.get(i);
        		for (Integer n : Hp) {
        			score -= Hb[n];
        		}
    		}
    		if (score < K) {
    			continue;
    		} else {
    			for (int j = -1; j < Wnum.size(); j++) {
    				int score2 = score;
    				if (-1 < j) {
            			List<Integer> Wp = Wnum.get(j);
                		for (Integer n : Wp) {
                			score2 -= Wb[n];
                		}
    				}
            		if (score2 == K) {
            			ans++;
            		}
        		}
    		}
    	}
    	System.out.println(ans);
	}
}