import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i++){
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			double p = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
			double q = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*x1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
			double a = Math.sqrt((x2-x1)*(y2-y1)+(y2-y1)*(x2-x1));
			double b = Math.sqrt((x3-x2)*(y3-y2)+(y3-y2)*(x3-x2));
			double c = Math.sqrt((x3-x1)*(y3-y1)+(y3-y1)*(x3-x1));
			double s = (a+b+c)/2;
			BigDecimal bd = new BigDecimal(p);
		    BigDecimal bd1 = bd.setScale(3, BigDecimal.ROUND_HALF_UP);     
		    bd = new BigDecimal(q);
		    BigDecimal bd2 = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
		    bd = new BigDecimal(s);
		    BigDecimal bd3 = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
			System.out.println(bd1+" "+bd2+" "+bd3);
		}
	}
}