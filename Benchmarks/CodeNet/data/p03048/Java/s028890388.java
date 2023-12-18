import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
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
		int ir,jg;
		for(i=0;i<=imax;i++) {
			ir=i*r;
			for(j=0;j<=jmax;j++) {
				jg=j*g;
				if(ir+jg>n)break;
				if((n-(ir+jg))%b==0)cnt++;
			}
		}
		System.out.println(cnt);
	}
}
