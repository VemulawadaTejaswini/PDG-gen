import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			if(m == 0) break;
			int[] xm = new int[m];
			int[] ym = new int[m];
			for(int i = 0; i < m; i++) {
				xm[i] = sc.nextInt();
				ym[i] = sc.nextInt();
			}
			
			int n = sc.nextInt();
			int[] xn = new int[n];
			int[] yn = new int[n];
			for(int i = 0; i < n; i++) {
				xn[i] = sc.nextInt();
				yn[i] = sc.nextInt();
			}
			CON:for(int i = 0; i < n; i++) {
				int mox = xn[i] - xm[0];
				int moy = yn[i] - ym[0];
				for(int j = 0; j < m; j++) {
					boolean ok = false;
					for(int k = 0; k < n; k++) {
						if(xn[k] == xm[j]+mox && yn[k] == ym[j]+moy) {
							ok = true;
							break;
						}
					}
					if(!ok) continue CON;
				}
				
				System.out.println(mox + " " + moy);
				break;
				
			}
			
			
		}
	}


}