import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Long []a,b,c;
	static long []abss_a,abss_b,abss_c;

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
		a = new Long[x];
		b = new Long[y];
		c = new Long[z];
		for(int i=0;i<x;i++)a[i]=Long.parseLong(sc.next());
		for(int i=0;i<y;i++)b[i]=Long.parseLong(sc.next());
		for(int i=0;i<z;i++)c[i]=Long.parseLong(sc.next());

		sc.close();

		Arrays.sort(a,Comparator.reverseOrder());
		Arrays.sort(b,Comparator.reverseOrder());
		Arrays.sort(c,Comparator.reverseOrder());


		if(x>K)x=K;
		if(y>K)y=K;
		if(z>K)z=K;

		abss_a = new long[x];
		abss_b = new long[y];
		abss_c = new long[z];

		//a,b,c それぞれのabs[0]-[i] 差分格納
		for(int i=0;i<x;i++)abss_a[i]=a[0]-a[i];
		for(int i=0;i<y;i++)abss_b[i]=b[0]-b[i];
		for(int i=0;i<z;i++)abss_c[i]=c[0]-c[i];

		int tx=1,ty=1,tz=1;
		int xyz_max = Math.min(1000010,x*y*z);
		//配列要素の上限に達していないかのフラグ
		boolean fx=x==1?false:true, fy=y==1?false:true, fz=z==1?false:true;
		boolean f_xyz=false;
		if(fx&&fy&&fz)f_xyz=true;
		while(xyz_max>tx*ty*tz) {
			if(f_xyz) {
				if(abss_a[tx]<abss_b[ty]) {
					if(abss_a[tx]<abss_c[tz]) {
						tx++;
						if(tx>=x) {fx=false;f_xyz=false;}
					}else if(abss_a[tx]>abss_c[tz]){
						tz++;
						if(tz>=z) {fz=false;f_xyz=false;}
					}else {
						if(abss_a[tx]==abss_c[tz]){
							tx++;tz++;
							if(tx>=x) {fx=false;f_xyz=false;}
							if(tz>=z) {fz=false;f_xyz=false;}
						}
					}
				}else if(abss_b[ty]<abss_a[tx]) {
					if(abss_b[ty]<abss_c[tz]) {
						ty++;
						if(ty>=y) {fy=false;f_xyz=false;}
					}else if(abss_b[ty]>abss_c[tz]){
						tz++;
						if(tz>=z) {fz=false;f_xyz=false;}
					}else {
						if(abss_b[ty] == abss_c[tz]){
							ty++;tz++;
							if(ty>=y) {fy=false;f_xyz=false;}
							if(tz>=z) {fz=false;f_xyz=false;}
						}
					}
				}else {
					if(abss_a[tx]==abss_c[tz]||abss_b[ty]==abss_c[tz]) {
						tz++;
						if(tz>=z) {fz=false;f_xyz=false;}
					}
					if(abss_a[tx] == abss_b[ty]){
						tx++;ty++;
						if(tx>=x) {fx=false;f_xyz=false;}
						if(ty>=y) {fy=false;f_xyz=false;}
					}
				}
				continue;
			}

			if(fx) {
				if(fy) {
					if(abss_a[tx]<abss_b[ty]) {
						tx++;
						if(tx>=x)fx=false;
					}else if(abss_a[tx]>abss_b[ty]){
						ty++;
						if(ty>=y)fy=false;
					}else {
						tx++;ty++;
						if(tx>=x)fx=false;
						if(ty>=y)fy=false;
					}
				}else if(fz) {
					if(abss_a[tx]<abss_c[tz]) {
						tx++;
						if(tx>=x)fx=false;
					}else if(abss_a[tx]>abss_c[tz]){
						tz++;
						if(tz>=z)fz=false;
					}else {
						tx++;tz++;
						if(tx>=x)fx=false;
						if(tz>=z)fz=false;
					}
				}else {
					while(xyz_max>tx*ty*tz) {tx++;}
				}
			}else if(fy) {
				if(fz) {
					if(abss_b[ty]<abss_c[tz]) {
						ty++;
						if(ty>=y)fy=false;
					}else if(abss_b[ty]>abss_c[tz]) {
						tz++;
						if(tz>=z)fz=false;
					}else {
						ty++;tz++;
						if(ty>=y)fy=false;
						if(tz>=z)fz=false;
					}
				}else{
					while(xyz_max>tx*ty*tz) {ty++;}
				}
			}else if(fz) {
				while(xyz_max>tx*ty*tz) {tz++;}
			}
		}

		x=tx;y=ty;z=tz;

		List<Long> list = new ArrayList<Long>();
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
