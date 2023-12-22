import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long n = Long.parseLong(str);
		long h;
		long g = 0;
		str = sc.next();
		h = Long.parseLong(str);
		g = h;
		for(int i =0;i<n-1;i++) {
			str = sc.next();
			h = Long.parseLong(str);
			if(h == 0) {
				g=0;
				break;
			}
			g *= h;

		}

        sc.close();
        if(g > (long)Math.pow(10, 18) || g  < 0) {
        	System.out.println("-1");
        }else {
        System.out.println(g);
        }
	}
}