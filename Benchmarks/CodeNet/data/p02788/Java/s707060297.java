import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		
		Dis[] arr = new Dis[n];
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			int l = x-d;
			int r = x+d;
			if(l<0)
				l = 0;
			arr[i] = new Dis(l, r, (int)Math.ceil((double)h/a));
		}
		Arrays.sort(arr, new Comparator<Dis>() {

			@Override
			public int compare(Dis o1, Dis o2) {
				if(o1.l>o2.l)
					return 1;
				else if(o1.l==o2.l) {
					if(o1.r>o2.r)
						return 1;
					else if(o1.r==o2.r)
						return 0;
					else
						return -1;
				}
				else
					return -1;
			}
			
		});
		
		long ans = 0;
		int l = arr[0].l, r = arr[0].r, t = arr[0].t;
		for(int i=1;i<n;i++) {
			if(arr[i].l<=r) {
				r = arr[i].r;
				t = Math.max(t, arr[i].t);
			}
			else {
				ans+=t;
				l = arr[i].l;
				r = arr[i].r;
				ht = arr[i].t;
			}
		}
		if(h!=0)
			ans+=h;
		
		System.out.println(ans);
	}

}
class Dis{
	int l, r, t;
	Dis(int l, int r, int t){
		this.l = l;
		this.r = r;
		this.t = t;
	}
}