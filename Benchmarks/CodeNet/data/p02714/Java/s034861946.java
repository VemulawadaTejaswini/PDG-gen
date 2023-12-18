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
		ans = R.size()*B.size()*G.size();
		int sub = 0;
		while(!R.isEmpty()) {
			int nowR = R.remove(0);
			for(int i = 0; i < B.size(); i++) {
				int nowB = B.get(i);
				int l = Math.abs(nowR-nowB);
				if(G.contains((nowR+nowB)/2)&&l%2==0) {
					sub++;
				}
				if(nowR<nowB) {
					if(G.contains(nowB+l)&&nowB+l<s.length-1) {
						sub++;
					}
					if(G.contains(nowR-l)&&nowR-l>=0) {
						sub++;
					}
					
				}
				else {
					if(G.contains(nowR+l)&&nowR+l<s.length-1) {
						sub++;
					}
					if(G.contains(nowB-l)&&nowB-l>=0) {
						sub++;
					}
				}		
			}
		}
		System.out.println(ans-sub);
	}
}