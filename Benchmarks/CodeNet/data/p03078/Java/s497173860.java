import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Long []a,b,c;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		a = new Long[(x+1)];
		b = new Long[(y+1)];
		c = new Long[(z+1)];
		a[0]=0L;b[0]=0L;c[0]=0L;
		for(int i=1;i<=x;i++)a[i]=Long.parseLong(sc.next());
		for(int i=1;i<=y;i++)b[i]=Long.parseLong(sc.next());
		for(int i=1;i<=z;i++)c[i]=Long.parseLong(sc.next());

		sc.close();
		/*
		Arrays.sort(a,(a1,a2)->Long.compare(a2,a1));
		Arrays.sort(b,(a1,a2)->Long.compare(a2,a1));
		Arrays.sort(c,(a1,a2)->Long.compare(a2,a1));
		*/
		Arrays.sort(a,Comparator.reverseOrder());
		Arrays.sort(b,Comparator.reverseOrder());
		Arrays.sort(c,Comparator.reverseOrder());
		List<Long> list = new ArrayList<Long>();

		if(x>K)x=K;
		if(y>K)y=K;
		if(z>K)z=K;


		long absa = a[x-1]-a[x];
		long absb = b[y-1]-b[y];
		long absc = c[z-1]-c[z];
		if(absa > absb) {
			if(absb>absc) {
				while(x*y*z>1100000)z--;
			}else {
				while(x*y*z>1100000)y--;
			}
		}else {
			if(absa>absc) {
				while(x*y*z>1100000)z--;
			}else {
				while(x*y*z>1100000)x--;
			}
		}





		/*
		while(x*y*z>1000000) {
			if(a[x-1]>b[y-1]) {
				if(b[y-1]>c[z-1]) {
					z--;
				}else {
					y--;
				}
			}else {
				if(a[x-1]>c[z-1]) {
					z--;
				}else {
					x--;
				}
			}
		}*/

	/*
		if(x > 100 && y>100&&z>100) {
			x=100;y=100;z=100;
		}
	*/
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					list.add(a[i]+b[j]+c[k]);
				}
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<K;i++) {
			System.out.println(list.get(i));
		}

	}

}
