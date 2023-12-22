import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int r = input.nextInt();
    	for(int i = 0 ; i < r ; i++){
    		//x^2 + y^2 + lx + my + n = 0
    		double x1 = input.nextDouble();
    		double y1 = input.nextDouble();
    		double x2 = input.nextDouble();
    		double y2 = input.nextDouble();
    		double x3 = input.nextDouble();
    		double y3 = input.nextDouble();

    		double x = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
    		double y = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
    		System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y))).setScale(3, BigDecimal.ROUND_HALF_UP));
    	}
    }
}