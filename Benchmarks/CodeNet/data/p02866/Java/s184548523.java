import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static long MOD = 998244353;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] d = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(i=0;i<n;i++) {
			d[i] = parseInt(sc.next());
			if(map.get(d[i])==null) {
				map.put(d[i], 1);
			} else {
				map.put(d[i], map.get(d[i])+1);
			}
		}
		sc.close();
		long ans=0;
		if(d[0]==0) {
			ArrayList<Integer> list = new ArrayList<>(map.keySet());
			Collections.sort(list);
			ans=1;
			i=0;
			int pre = list.get(i);
			i++;
			if(pre==0) {
				pre = list.get(i);
				i++;
			}
			for (; i < list.size(); i++) {
				ans*=(long)pow(map.get(pre),map.get(list.get(i)));
				if(ans>=MOD)ans%=MOD;
				pre = list.get(i);
			}
		}
		out.println(ans);
	}
}
