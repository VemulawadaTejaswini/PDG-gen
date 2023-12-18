import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = 0;
		int y = 0;
		int cnt = 0;
		int red = 1;
		int xbk = 0;
		int ybk = 0;
		
		for (int i = 0; i < m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (i != 0) {
			    if (x == red) {
				    if (!(x == xbk && y == ybk)) {
					    cnt++;
		  			    red = y;
					    xbk = x;
					    ybk = y;
				    }
			    }
			} else {
				xbk = x;
				ybk = y;
				if (x == 1) {
					cnt++;
					red = y;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}