import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		double x=0,y=0,x1,y1;
		while(sc.hasNext()){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			f=sc.nextInt();
			y=(c*d-f*a)/(b*d-e*a);
			x=(c-b*y)/a;
			BigDecimal xans = new BigDecimal(x);
			BigDecimal yans = new BigDecimal(y);
			x1=xans.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			y1=yans.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println(x1+" "+y1);
		}
	}
}