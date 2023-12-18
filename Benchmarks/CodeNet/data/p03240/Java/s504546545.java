import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for(i = 0; i < n; i++) {
			x[i] = parseInt(sc.next());  
			y[i] = parseInt(sc.next());  
			h[i] = parseInt(sc.next());  
		}
		sc.close();
		int hh, hh0;
		int max=0;
		int mx = 0;
		int my = 0;
		for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				for (i=0; i < n; i++) {
					if(h[i]!=0)break;
				}
				boolean f = true; 
				hh0 = abs(x[i]-cx) + abs(y[i]-cy) + h[i];
				i++;
				for (; i < n; i++) {
					if(h[i]==0)continue;
					hh = abs(x[i]-cx) + abs(y[i]-cy) + h[i];
					if(hh0 != hh) {
						f = false;
						break;
					}
				}
				if(f) {
					if(max < hh0) {
						max = hh0;
						mx = cx;
						my = cy;
					}
				}
			}
		}
		out.printf("%d %d %d%n", mx, my, max);
	}
}