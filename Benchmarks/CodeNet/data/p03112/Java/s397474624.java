
import java.util.Scanner;
public class Main {
	
	static int a;
	static int b;
	static int q;
	static long []s;
	static long []t;
	static long []x;
	static long [][]aa;
	static long [][]bb;
	static long []ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 a = Integer.parseInt(sc.next());
		 b = Integer.parseInt(sc.next());
		 q = Integer.parseInt(sc.next());
		
		
		 s = new long [a+2];
		 t = new long [b+2];
		 x = new long [q];
		
		for(int i = 1 ;i <= a ; i++) {
			s[i] = Long.parseLong(sc.next());
		}
		for(int i = 1; i <= b ;i++) {
			t[i] = Long.parseLong(sc.next());
		}
		for(int i = 0 ; i < q ;i++) {
			x[i] = Long.parseLong(sc.next());
		}
		s[0] = -100000000000000L;
		s[a+1] = 1000000000000000L;
		t[0] = s[0];
		t[b+1] = s[a+1];
		aa = new long [q][2];
		bb = new long [q][2];
		
		ans = new long [q];
		
		solve();
		
		for(int i = 0 ;i < q ;i++) {
			System.out.println(ans[i]);
		}
		
	}
	
	static void solve() {
		
		for(int i = 0 ;i < q ;i++) {
			int Amax = a+1;
			int Amin = 0;
			int Bmax = b+1;
			int Bmin = 0;
			
			boolean flag1 = false;
			boolean flag2 = false;
		while(Amax - Amin > 1) {
			
			int mid = (Amax + Amin)/2;
			
			if(s[mid] == x[i]) {
				flag1 = true;
				break;
			}
			else if(s[mid] <x[i]) {
				Amin = mid;
			}
			else {
				Amax = mid;
			}
		}
		if(flag1) {
			aa[i][0] = 0;
			aa[i][1] = 0;
		}
		else {
		aa[i][0] = s[Amax] - x[i];
		aa[i][1] = s[Amin] - x[i]; 
		}
		
		while(Bmax - Bmin > 1) {
			
			int mid = (Bmax + Bmin)/2;
			
			if(t[mid] == x[i]) {
				flag2 = true;
				break;
			}
			else if(t[mid] < x[i]) {
				Bmin = mid;
			}
			else {
				Bmax = mid;
			}
		}
		if(flag2) {
			bb[i][0] = 0;
			bb[i][0] = 0;
		}
		
		else {
		bb[i][0] = t[Bmax] - x[i];
		bb[i][1] = t[Bmin] - x[i];
		}
		
		long temp = 2000000000000000000L;
		
		for(int j = 0 ;j <= 1 ; j++) {
			for(int k = 0 ;k <= 1 ;k++) {
				if((aa[i][j] > 0 && bb[i][k] > 0)||(aa[i][j] < 0 && bb[i][k] < 0)) {
					long a = Math.abs(aa[i][j]);
					long b = Math.abs(bb[i][k]);
					temp = Math.min(temp, Math.max(a, b));
				}
				else {
					long a = Math.abs(aa[i][j]);
					long b = Math.abs(bb[i][k]);
					
					long temp1 = Math.max(a, b) + Math.min(a, b) * 2;
					temp1 = Math.abs(temp1);
					temp = Math.min(temp,temp1);
				}
			}
		}
		
		ans[i] = temp;
		
			}
			
		}
	
	

}
