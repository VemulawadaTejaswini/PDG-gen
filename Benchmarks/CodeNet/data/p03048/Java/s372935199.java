import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		int cnt=0;
		int imax=n/r;
		int jmax=n/g;
		int kmax=n/b;
		int ir,jg,kb;
		for(i=0;i<=imax;i++) {
			ir=i*r;
			for(j=0;j<=jmax;j++) {
				jg=j*g;
				if(ir+jg>n)break;
				for(k=0;k<=kmax;k++) {
					kb=k*b;
					if(ir+jg+kb==n) cnt++;
					if(ir+jg+kb>n)break;
				}
			}
		}
		System.out.println(cnt);
	}
}
