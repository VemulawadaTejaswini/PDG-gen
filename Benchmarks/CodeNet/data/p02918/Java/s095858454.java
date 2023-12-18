import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		ArrayList<Integer> lr = new ArrayList<>();
		char pre = ' ';
		for (i = 0; i < s.length; i++) {
			if(s[i] != pre) {
				lr.add(1);
				pre = s[i];
			} else {
				lr.set(lr.size()-1, lr.get(lr.size()-1)+1);
			}
		}
//		out.println(lr.toString());
		int mx = 0;
		if(lr.size()==1 || lr.size() <= 2*k+1) {
			mx = n - 1;
		} else {
			int[] cnt = new int[2];
			for (i = 0; i < lr.size(); i++) {
				cnt[i%2] += lr.get(i)-1;
			}
//			out.println(Arrays.toString(cnt));
			int cnt2 = 0;
			for (i = 0; i < lr.size() - 2*(k-1); i++) {
				cnt2 = cnt[(i+1)%2] + k - (i==0?1:0);
				for (j = 0; j < 2*k; j+=2) {
					cnt2 += lr.get(j+i);
				}
//				out.printf("%d:%d%n",i,cnt2);
				if(cnt2>mx)mx=cnt2;
			}
		}
		out.println(mx);
	}
}
