import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x,y;    //变量
		int a,b,c,d,e,f;    //参数
		while(in.hasNext()) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			e = in.nextInt();
			f = in.nextInt();
			if(c*e-b*f==0)
				x=0;
			else
			    x = ((double)c*e-b*f)/((double)a*e-b*d);
			if(c*d-a*f==0)
				y=0;
			else
			    y = ((double)c*d-a*f)/((double)b*d-a*e);
			System.out.format("%.3f %.3f\n", x , y);
		}
		in.close();
	}
}
