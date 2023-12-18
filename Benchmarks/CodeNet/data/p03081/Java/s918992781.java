import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<q;i++) {
			sb1.append(in.next());
			sb2.append(in.next());
		}
		String t = sb1.toString();
		String d = sb2.toString();
		int ans = 0;
		//to_left
		int idx_l = 0;
		int idx_r = n-1;
		if(move(s,t,d,0)<0) {
			while(idx_r>idx_l+1) {
				int idx_mid = (idx_l+idx_r)/2;
				int toward = move(s,t,d,idx_mid);
				if(toward<0) idx_l = idx_mid;
				else idx_r = idx_mid;
			}
			ans += idx_l+1;
		}
		//to_right
		idx_l = 0;
		idx_r = n-1;
		if(move(s,t,d,n-1)>0) {
			while(idx_r>idx_l+1) {
				int idx_mid = (idx_l+idx_r)/2;
				int toward = move(s,t,d,idx_mid);
				if(toward>0) idx_r = idx_mid;
				else idx_l = idx_mid;
			}
			ans += n-idx_r;
		}
		System.out.println(n-ans);
		in.close();
	}
	
	public static int move(String s,String t,String d,int idx) {
		int n = s.length();
		int q = t.length();
		int ret = 0;
		for(int i=0;i<q;i++) {
			if(s.charAt(idx)==t.charAt(i)) {
				if(d.charAt(i)=='L') idx--;
				else idx++;
			}
			if(idx<0) {
				ret = -1;
				break;
			}
			if(idx>=n) {
				ret = 1;
				break;
			}
		}
		return ret;
	}

}
