import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long UN = sc.nextLong();
		sc.close();
		sc = null;
		long x;
		long s = UN / 4 + 1;
		long s0,s1;
		long h=0,n=0,w=0;
		LABEL:for(h=s;h<=3500;h++) {
			for(n=h;n<=3500;n++) {
				x=h*n;
				s0=UN*x;
				s1=4*x-UN*(n+h);
				if(s1<=0)continue;
				if(s0%s1==0) {
					w=s0/s1;
					break LABEL;
				}
			}
		}
		System.out.println(h + " " + n + " " + w);
	}
}
