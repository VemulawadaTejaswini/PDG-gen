import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d,e,f;
		double temp1,temp2;
		double x,y;
		while(s.hasNext()){
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			d=s.nextInt();
			e=s.nextInt();
			f=s.nextInt();
			temp1=a*e-b*d;
			temp2=c*e-b*f;
			x=temp2/temp1;
			if(x==0)
				x=0;
			y=(c-a*x)/b;
			System.out.printf("%1.3f %1.3f\n",x,y);
		}
	}
}