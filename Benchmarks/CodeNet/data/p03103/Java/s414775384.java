import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		List<Long> a = new ArrayList<Long>();
		List<Long> b = new ArrayList<Long>();
		long x = 0;
		long y = 0;
		for(int i = 0;i<n;i++) {
			x = scn.nextLong();
			y = scn.nextLong();
			for(int j = 0;j<=i;j++) {
				if(i==j) {
					a.add(x);
					b.add(y);
					break;
				}
				if(a.get(j)<x) {
					continue;
				}else {
					a.add(j, x);
					b.add(j, y);
				}
			}
		}
		x=0;
		for(int i = 0;0<m; i++) {
			if(m<=b.get(i)) {
				System.out.println(m*a.get(i)+x);
				break;
			}else {
				m -= b.get(i);
				x += a.get(i)*b.get(i);
			}
		}
		scn.close();
	}
}