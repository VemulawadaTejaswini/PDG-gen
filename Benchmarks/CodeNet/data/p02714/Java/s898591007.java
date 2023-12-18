import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();
		List<Integer> R = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> G = new ArrayList<Integer>();
		long ans = 0;
		for(int i = 0; i < n; i++) {
			if(s[i] =='R') {
				R.add(i);
			}
			else if(s[i] =='B') {
				B.add(i);
			}
			else if(s[i] =='G') {
				G.add(i);
			}
		}
		long sub = 0;
		ans = R.size()*B.size()*G.size();
		while(!R.isEmpty()) {
			int nowR = R.remove(0);
			for(int i = 0; i < B.size(); i++) {
				int nowB= B.get(i);
				int c = (nowR+nowB)/2;
				int l = Math.abs(nowR-nowB); 
				if(G.contains(c)&&l%2==0) {
					sub++;
				}
				if(nowB>nowR) {
					if(G.contains(nowB+l)) {
						sub++;
					}
					if(G.contains(nowR-l)) {
						sub++;
					}
				}
				else {
					if(G.contains(nowB-l)) {
						sub++;
					}
					if(G.contains(nowR+l)) {
						sub++;
					}
				}
			}
		}
		System.out.println(ans-sub);
	}
}