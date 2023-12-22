import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		double[] p1= {0,0};
		double[] p2= {100,0};
		n=scan.nextInt();
		koch(n,p1,p2);
		System.out.printf("%f %f\n",p2[0],p2[1]);
		scan.close();
	}
	public static void koch(int n,double[] p1,double[] p2) {
		if(n==0) {
			show(p1);
		}
		else {
			double[] s=new double[2];
			double[] u=new double[2];
			double[] t=new double[2];
			s[0]=p1[0]+(p2[0]-p1[0])/3;
			s[1]=p1[1]+(p2[1]-p1[1])/3;
			t[0]=p1[0]+2*(p2[0]-p1[0])/3;
			t[1]=p1[1]+2*(p2[1]-p1[1])/3;
			u[0]=(t[0]-s[0])*Math.cos(Math.toRadians(60))-(t[1]-s[1])*Math.sin(Math.toRadians(60))+s[0];
			u[1]=(t[0]-s[0])*Math.sin(Math.toRadians(60))-(t[1]-s[1])*Math.cos(Math.toRadians(60))+s[1];
			n--;
			koch(n,p1,s);
			koch(n,s,u);
			koch(n,u,t);
			koch(n,t,p2);
		}
	}
	public static void show(double[] d) {
		System.out.printf("%f %f\n",d[0],d[1]);
	}
}
