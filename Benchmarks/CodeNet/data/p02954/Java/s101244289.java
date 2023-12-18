import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		char[] S = sc.next().toCharArray();
		int N = S.length;
		
		int index = 0;
		while(index < N) {
			int[] LRcount = getLR(S, index);
			int[] ans = getChild(LRcount);
			for(int a : ans) {
				pw.println(a);
			}
			index += LRcount[0]+LRcount[1];
		}
		
		pw.close();
		sc.close();
	}
	
	static int[] getLR(char[] S, int index) {
		int[] count = new int[2];
		
		for(; index<S.length && S[index]=='R'; index++)
			count[0]++;
		for(; index<S.length && S[index]=='L'; index++)
			count[1]++;
		
		return count;
	}
	
	static int[] getChild(int[] count) {
		int R = count[0];
		int L = count[1];
		int[] ans = new int[R+L];
		
		ans[R-1] = (R+1)/2 + L/2;
		ans[R] = R/2 + (L+1)/2;
		
		return ans;
	}
}