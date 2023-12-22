import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
			double x1=s.nextDouble(),y1=s.nextDouble(),
					x2=s.nextDouble(),y2=s.nextDouble(),
					x3=s.nextDouble(),y3=s.nextDouble(),
					x4=s.nextDouble(),y4=s.nextDouble();
			double a=(x2-x1)*(x4-x3)+(y2-y1)*(y4-y3);
			double b=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))*((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
			if(a*a==b)System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
}
//by Tuvshee 12.05.2012
//Capitalize