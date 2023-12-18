
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();

		ArrayList<Long> l = new ArrayList<Long>();
		for(int i=2; i*i<=m; i++) {
			if(m%i==0) {
				l.add((long)i);
				if(i*i!=m) {
					l.add(m/i);
				}
			}
		}
		long ans = 1;
		for(int i=0; i<l.size(); i++) {
			long v=l.get(i);
			if(v*n<=m) {
				ans = Math.max(ans, v);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
