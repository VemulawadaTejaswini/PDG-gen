
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int z=sc.nextInt();
		long w=sc.nextLong();
		ArrayList<Long> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a.add(sc.nextLong());
		}

		long ans = 0;
		for(int i=0; i<n-1; i++) {
			boolean isy = true;
			int j=i;
			long tmp;
			while(j<n-1) {
				if(isy) {
					tmp = Long.MAX_VALUE;
				}else {
					tmp = 0;
				}
				int nextj = j+1;
				for(int k=j+1; k<n; k++) {
					if(isy) {
						if(Math.abs(a.get(j)-a.get(k)) < tmp) {
							tmp = Math.abs(a.get(j)-a.get(k));
							nextj=k;
						}
					}else {
						if(Math.abs(a.get(j)-a.get(k)) > tmp) {
							tmp = Math.abs(a.get(j)-a.get(k));
							nextj=k;
						}
					}
				}
				ans = Math.max(ans, tmp);
				j=nextj;
				isy = !isy;
			}
		}
		ans = Math.max(ans, Math.abs(a.get(n-1) - w)) ;
		System.out.println(ans);
		sc.close();
	}
}
