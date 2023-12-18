import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Maybe use while loops if TLE
		Scanner input = new Scanner(System.in); 
		String S = input.next();
		int N = S.length();
		int ans = 0;
		boolean[] vis = new boolean[N];
		for (int i = 0; i < N-1; i++) {
			if (S.charAt(i)=='<'&&S.charAt(i+1)=='>') {
				int prev = 0;
				int next = 0;
				for (int back = i; back>=0; back--) {
					if (S.charAt(back)!='<') break;
					else {
						prev++;
						vis[back]=true;
					} 
				}
				for (int up = i+1; up<N; up++) {
					if (S.charAt(up)!='>') {
						break;
					} 
					else {
						next++;
						vis[up]=true;
					} 
				}
				int max = Math.max(prev, next); //0<1<2<6>5>4>3>2>1>0; max = 6 --> increases ans by 21 
				int min = Math.min(prev, next);
				min--;
				ans+=max*(max+1)/2;
				ans+=min*(min+1)/2;
			}
		}
		int L = 0;
		for (int i = 0;; i++) {
			if (vis[i]) break;
			else L++;
		}
		int R = 0;
		for (int i = N-1;; i--) {
			if (vis[i]) break;
			else R++;
		}
		ans+=L*(L+1)/2;
		ans+=R*(R+1)/2;
		System.out.println(ans);
	}
}