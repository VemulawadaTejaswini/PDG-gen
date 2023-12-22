import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = Integer.parseInt(str);
		long h;
		long g = 0;
		str = sc.next();
		h = Integer.parseInt(str);
		g = h;
		for(int i =0;i<n-1;i++) {
			str = sc.next();
			h = Integer.parseInt(str);
			g *= h;
		}

        sc.close();
        if(g > Math.pow(10, 18)) {
        	System.out.println("-1");
        }else {
        System.out.println(g);
        }
	}

}