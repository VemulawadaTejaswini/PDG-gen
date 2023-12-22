import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			double xp1=in.nextDouble(),yp1=in.nextDouble();
			double xp2=in.nextDouble(),yp2=in.nextDouble();
			double xp3=in.nextDouble(),yp3=in.nextDouble();
			double xk=in.nextDouble(),yk=in.nextDouble();
			double xs=in.nextDouble(),ys=in.nextDouble();
			int k=0;
			if(judge(xp1,yp1,xp2,yp2,xk,yk,xs,ys))//壁と交差する
				k++;
			if(judge(xp2,yp2,xp3,yp3,xk,yk,xs,ys))
				k++;
			if(judge(xp3,yp3,xp1,yp1,xk,yk,xs,ys))
				k++;
			System.out.println(k==1 ? "OK":"NG");
		}
	}
	
	static boolean judge(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		double jc1=(x1-x2)*(y3-y1)+(y1-y2)*(x1-x3);
		double jd1=(x1-x2)*(y4-y1)+(y1-y2)*(x1-x4);
		double jc2=(x3-x4)*(y1-y3)+(y3-y4)*(x3-x1);
		double jd2=(x3-x4)*(y2-y3)+(y3-y4)*(x3-x2);
		return jc1*jd1<0 && jc2*jd2<0;
	}
}