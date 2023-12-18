import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long UN = sc.nextLong();
		sc.close();
		sc = null;
		long x;
		long s = UN / 4 + 1;
		long h=0,n=0,w=0;
		LABEL:for(h=s;h<=3500;h++) {
			for(n=h;n<=3500;n++) {
				for(w=n;w<=3500;w++) {
					x=n*h;
					if(UN*((n+h)*w+x) == 4*x*w)break LABEL;
				}
			}
		}
		System.out.println(h + " " + n + " " + w);
	}
}
