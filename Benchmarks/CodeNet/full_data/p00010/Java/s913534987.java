import java.util.*;
import java.text.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		for(int t=1,T=in.nextInt();t<=T;t++){
			//x^2+y^2 -2xi*x -2yi*y +xi^2+yi^2 =r^2
			//G[] =>  -2xi   -2yi    xi^2+yi^2
			double g[][]=new double[5][5];
			double x=0,y=0;
			for(int i=1;i<=3;i++){
				x=in.nextDouble();
				y=in.nextDouble();
				g[i][1]=-2*x;
				g[i][2]=-2*y;
				g[i][3]=x*x+y*y;
			}
			for(int i=2;i<=3;i++)
				for(int j=1;j<=3;j++)
					g[i][j]-=g[1][j];
			double a1=g[2][1],b1=g[2][2],c1=g[2][3];
			double a2=g[3][1],b2=g[3][2],c2=g[3][3];
			double x0=(b1*c2-b2*c1)/(b2*a1-b1*a2);
			double y0=(a1*c2-a2*c1)/(a2*b1-a1*b2);
			double r=Math.sqrt((x-x0)*(x-x0)+(y-y0)*(y-y0));
			DecimalFormat df=new DecimalFormat("0.000");
			System.out.println(df.format(x0)+" "+df.format(y0)+" "+df.format(r));
		}
		in.close();
	}
}