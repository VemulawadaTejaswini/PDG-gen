import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        long w = sc.nextInt();
        long h = sc.nextInt();
        long x = sc.nextInt();
        long y = sc.nextInt();
        long midx = 0, midy = 0, s = 0;
        int cnt = 0;
        
        midx = Math.floorDiv(w, 2);
        midy = Math.floorDiv(h, 2);

        if ((Math.abs(x - midx) < Math.abs(y - midy) && x != 0) || (x != 0 && y == 0)) {
            if ((x - midx) < 0) {
                s = Math.multiplyExact(x, h);
            } else {
                s = Math.multiplyExact((w - x), h);
            }
        } else if (y != 0) {
            if ((y - midy) < 0) {
                s = Math.multiplyExact(y, w);
            } else {
                s = Math.multiplyExact((h - y), w);
            }
        }

        if (Math.abs(x - midx)  == 0 && Math.abs(y - midy) == 0) {
            cnt = 1;
        }

        System.out.println(s+" "+cnt);

		sc.close();
	}
}
