import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0;
		Scanner sc = new Scanner(in);
		int q = parseInt(sc.next());
		int[] l = new int[q];
		int[] r = new int[q];
		int mx = 0;
		for (i = 0; i < q; i++) {
			l[i] = parseInt(sc.next());
			r[i] = parseInt(sc.next());
			if(mx<r[i])mx=r[i];
		}
		sc.close();
		ArrayList<Integer> plist = new ArrayList<>(); 
		plist.add(2);
		boolean[] pflag = new boolean[mx+1];
		pflag[2] = true;
		for (i = 3; i <= mx; i+=2) {
			boolean f=true;
			for (j = 0; j < plist.size() && plist.get(j) * plist.get(j) <= i; j++) {
				if(i%plist.get(j)==0) {
					f=false;
					break;
				}
			}
			if(f) {
				plist.add(i);
			}
			pflag[i]=f;
		}
		int[] acc = new int[mx+2];
		int tmp=0;
		for (i = 3; i <= mx; i+=2) {
			if(pflag[i]&&pflag[(i+1)/2]) {
				tmp++;
			}
			acc[i]=tmp;
			acc[i+1]=tmp;
		}
		int[] cnt = new int[q];
		for (i = 0; i < q; i++) {
			cnt[i] = acc[r[i]] - acc[l[i] -1];
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < q; i++) {
			pw.println(cnt[i]);
		}
		pw.flush();
	}
}
