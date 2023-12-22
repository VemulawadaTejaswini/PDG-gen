import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] x = new int[5];
			int[] y = new int[5];
			Line2D.Double[] s = new Line2D.Double[4];
			for(int i=0;i<n;i++){
				for(int j=0;j<5;j++){
					x[j] = sc.nextInt();
					y[j] = sc.nextInt();
				}
				s[0] = new Line2D.Double(x[0],y[0],x[1],y[1]);
				s[1] = new Line2D.Double(x[1],y[1],x[2],y[2]);
				s[2] = new Line2D.Double(x[2],y[2],x[0],y[0]);
				s[3] = new Line2D.Double(x[3],y[3],x[4],y[4]);
				
				int ans = 1;
				for(int j=0;j<3;j++){
					if(s[j].intersectsLine(s[3])==false) ans = -ans;
				}
				
				if(ans==1) System.out.println("OK");
				else System.out.println("NG");
			}
		}	
	}	
}