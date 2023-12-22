import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			int ans = 0;
			double diff = Double.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int d = sc.nextInt();
				int h = sc.nextInt();
				int w = sc.nextInt();
				
				double d2 = Math.abs(22 - (double)w/((double)h*h/10000));
			//	System.out.println(d+" "+((double)w/((double)h*h/10000)));
				if(diff > d2){
					diff = d2;
					ans = d;
				}
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}