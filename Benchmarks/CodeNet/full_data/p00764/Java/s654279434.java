import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			double[] x = new double[2*n];
			double[] y = new double[2*n];
			Line2D.Double[] cross = new Line2D.Double[n];
			Line2D.Double p = new Line2D.Double();

			
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double ra = sc.nextDouble();
			double xb = 0;
			double yb = 0;
			double rb = 0;
			double a, b, c, A, B, C;
			
			x[0] = xa;
			y[0] = ya;
			for(int i=1;i<n;i++){
				xb = sc.nextDouble();
				yb = sc.nextDouble();
				rb = sc.nextDouble();
				
				A = xa-xb;
				B = ya-yb;
				C = (A*xa+A*xb+B*ya+B*yb+rb*rb-ra*ra)/2;
				if(A==0){
					c = (C/B-ya)*(C/B-ya)+xa*xa-ra*ra;
					x[2*i-1] = xa+Math.sqrt(xa*xa-c);
					x[2*i] = xa-Math.sqrt(xa*xa-c);
					y[2*i-1] = C/B;
					y[2*i] = C/B;
				}else if(B==0){
					c = (C/A-xa)*(C/A-xa)+ya*ya-ra*ra;
					y[2*i-1] = ya+Math.sqrt(ya*ya-c);
					y[2*i] = ya-Math.sqrt(ya*ya-c);
					x[2*i-1] = C/A;
					x[2*i] = C/A;
				}else{
					a = 1+(A*A)/(B*B);
					b = (2*A*ya*B-2*A*C-2*xa*B*B)/(B*B);
					c = (C/B-ya)*(C/B-ya)+xa*xa-ra*ra;
					x[2*i-1] = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
					x[2*i] = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
					y[2*i-1] = (C-A*x[2*i-1])/B;
					y[2*i] = (C-A*x[2*i])/B;
				}
				cross[i] = new Line2D.Double(x[2*i-1],y[2*i-1],x[2*i],y[2*i]);
				
				xa = xb;
				ya = yb;
				ra = rb;
			}
			x[2*n-1] = xb;
			y[2*n-1] = yb;
			
			double[][] cost = new double[2*n][2*n];
			for(int i=0;i<2*n;i++) Arrays.fill(cost[i], Integer.MAX_VALUE);			
			boolean flag;
			for(int i=0;i<2*n;i++){
				for(int j=i+1;j<2*n;j++){
					flag = false;
					p.setLine(x[i], y[i], x[j], y[j]);
					for(int k=(i+1)/2;k<(j+1)/2;k++){
						if(k!=0 && p.intersectsLine(cross[k])==false){
							flag = true;
							break;
						}
					}
					if(flag==false)	cost[i][j] = Math.sqrt((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i]));
				}
			}
			
			for(int i=0;i<2*n;i++) cost[i][i] = 0;
			for(int i=0;i<2*n;i++){
				for(int j=0;j<2*n;j++){
					for(int k=0;k<2*n;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
						}
					}
				}
			}
			System.out.println(cost[0][2*n-1]);
		}	
	}	
}