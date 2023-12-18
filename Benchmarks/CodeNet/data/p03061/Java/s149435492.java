import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	List<Long> yakusuA = new ArrayList<Long>();
	List<Long> yakusuB = new ArrayList<Long>();
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		int n = nextInt();
		long[]a = new long [n];
		for(int i=0;i<n;i++)a[i]=nextLong();
		Arrays.sort(a);

		yakusuA.add(a[0]);
		yakusuB.add(a[1]);

		long ti=a[1]/2;
		while(ti>1) {
			if(a[0]/2>=ti)if(a[0]%ti==0)yakusuA.add(ti);
			if(a[1]%ti==0)yakusuB.add(ti);
			ti--;
		}

		long res1 = 1;
		for(int li=0;li<yakusuA.size();li++) {
			long t=yakusuA.get(li);
			int cnt = 0;
			boolean flag = true;
			for(int i=n-1;0<i;i--) {
				if(a[i]%t!=0)cnt++;
				if(cnt >= 2) {flag = false; break;}
			}

			if(flag) {
				res1 = t;
				break;
			}
		}
		long res2 = 1;
		for(int li=0;li<yakusuB.size();li++) {
			long t=yakusuB.get(li);
			int cnt = 0;
			boolean flag = true;
			for(int i=n-1;0<i;i--) {
				if(a[i]%t!=0)cnt++;
				if(cnt >= 2) {flag = false; break;}
			}

			if(flag) {
				res2 = t;
				break;
			}
		}

		System.out.println(Math.max(res1,res2));
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
	private long nextLong() {
		return Long.parseLong(sc.next());
	}
}