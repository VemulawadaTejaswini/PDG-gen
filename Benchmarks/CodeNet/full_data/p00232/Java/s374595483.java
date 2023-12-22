import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	
	static int x;
	static int y;
	static int z;
	
	
	static int[] v;
	static int[] n;
	static int[] e;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			if(x == 0 && y == 0 && z == 0) break;
			
			v = new int[x];
			for(int i = 0; i < x; i++) {
				v[i] = sc.nextInt();
			}
			
			n = new int[z];
			e = new int[z];
			A = new int[z];
			
			for(int i = 0; i < z; i++) {
				n[i] = sc.nextInt();
				e[i] = sc.nextInt();
				A[i] = sc.nextInt();
			}
			
			double ans = solv(0,0,1);
			
			System.out.println((int)ans);
			
		}
		
	}
	
	static double solv(int a, int b, double c) {
		if(a >= y) return b * c;
		
		for(int i = 0; i < z; i++) {
			if(n[i] != a) continue;
			switch(e[i]) {
			case 1: a += A[i]; break;
			case 2: b += A[i]; break;
			case 3: b = Math.max(b - A[i], 0); break;
			}
		}
		
		if(a >= y) return b * c;
		
		double ret = 0;
		
		for(int i = 0; i < x; i++) {
			ret += solv(a + v[i],b,c * (1.0/x));
		}
		return ret;
		
	}
	
}