import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int noc=sc.nextInt(), a=sc.nextInt(),i=0,n=noc,ans=0;
		StringBuilder s = new StringBuilder();
		int[] c = new int[noc];
		while (noc-->0) c[i++]=sc.nextInt(); 
		noc=n;
		while (noc-->0) s.append("1");
		long l = Long.parseLong(s.toString(),2)+1,sum=0;
		while (--l>0) {
			i=0;sum=0;
			String b = Long.toBinaryString(l);
			StringBuilder st = new StringBuilder();
			int len=b.length();
			for (int j=1; j<=n-len; j++) st=st.append("0");
			st=st.append(b); b=st.toString();
			for (char ch : b.toCharArray()) {
				if (ch=='1') sum+=c[i];
				i++;
			}
			if (sum/Long.bitCount(l)==a && sum%Long.bitCount(l)==0) ans++;
		}
		System.out.println(ans);
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}
}

