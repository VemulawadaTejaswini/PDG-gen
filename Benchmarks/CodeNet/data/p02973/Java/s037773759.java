
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];

		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}

		ArrayList<Integer> d = new ArrayList<>();
		d.add(a[0]);

		for(int i=1; i<n; i++) {
			if(d.get(d.size()-1)>=a[i]){
				d.add(a[i]);
			}else {
				int l=-1;
				int r=d.size();
				while(l+1<r) {
					int mid = (l+r)/2;
					if(d.get(mid)>a[i]) {
						l=mid;
					}else {
						r=mid;
					}
				}
				d.set(l+1, a[i]);
			}
		}
		System.out.println(d.size());
		sc.close();
	}
}
