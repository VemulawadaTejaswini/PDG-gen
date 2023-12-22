import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3,xp,yp;
		double px[]=new double[2];
		double py[]=new double[2];
		double ans[]=new double[3];
		int i;
		while(s.hasNext()){
			x1=s.nextDouble();
			y1=s.nextDouble();
			x2=s.nextDouble();
			y2=s.nextDouble();
			x3=s.nextDouble();
			y3=s.nextDouble();
			xp=s.nextDouble();
			yp=s.nextDouble();

			px[0]=x2-x1;py[0]=y2-y1;
			px[1]=xp-x1;py[1]=yp-y1;
			ans[0]=px[0]*py[1]-py[0]*px[1];

			px[0]=x3-x2;py[0]=y3-y2;
			px[1]=xp-x2;py[1]=yp-y2;
			ans[1]=px[0]*py[1]-py[0]*px[1];

			px[0]=x1-x3;py[0]=y1-y3;
			px[1]=xp-x3;py[1]=yp-y3;
			ans[2]=px[0]*py[1]-py[0]*px[1];

			for(i=0;i<3;i++){
				if(ans[i]<=0){
					System.out.println("NO");
					break;
				}
			}
			if(i==3)
				System.out.println("YES");
		}//while
	}//main
}