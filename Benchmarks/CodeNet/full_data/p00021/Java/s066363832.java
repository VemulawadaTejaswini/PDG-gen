import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double x1,x2,x3,x4,y1,y2,y3,y4;
		int T=in.nextInt();
		for(int t=1;t<=T;t++){
			x1=in.nextDouble();
			x2=in.nextDouble();
			x3=in.nextDouble();
			x4=in.nextDouble();
			y1=in.nextDouble();
			y2=in.nextDouble();
			y3=in.nextDouble();
			y4=in.nextDouble();
			if(Math.abs((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4))<0.0000000001)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}