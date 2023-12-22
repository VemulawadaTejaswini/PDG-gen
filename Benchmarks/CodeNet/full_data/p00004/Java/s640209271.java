import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a,b,c,d,e,f;
			double x,y,det;
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			det=a*e-b*d;
			x=(1/det)*(e*c-b*f);
			y=(1/det)*(-c*d+a*f);
			if((x*1000)%1>=2/1){
				x=((x*1000-(x*1000)%1)+1)/1000;
			}else if((x*1000)%1<2/1){
				x=(x*1000-(x*1000)%1)/1000;
			}
			if((y*1000)%1>=2/1){
				y=((y*1000-(y*1000)%1)+1)/1000;
			}else if((y*1000)%1<2/1){
				y=(y*1000-(y*1000)%1)/1000;
			}
			System.out.println(String.format("%.3f %.3f",x,y));
		}
		sc.close();
	}
}