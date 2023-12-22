import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		double x1 = 0,x2 = 0, x3 = 0, x4 = 0, 
				y1 = 0, y2 = 0, y3 = 0,y4 = 0;
		BigDecimal X1,X2,X3,X4,Y1,Y2,Y3,Y4,dx1,dy1,dx2,dy2,l1,l2;
		boolean[] result = new boolean[n];
		for(int i = 0; i<n;i++){
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			x4 = sc.nextDouble();
			y4 = sc.nextDouble();
			if(x1 == x2 && x3 == x4){
				result[i] = true;
			} else if(x1 != x2 && x3 == x4){
				result[i] = false;
			} else if(x1 == x2 && x3 != x4){
				result[i] = false;
			} else {
				X1 = new BigDecimal(x1);
				X2 = new BigDecimal(x2);
				X3 = new BigDecimal(x3);
				X4 = new BigDecimal(x4);
				Y1 = new BigDecimal(y1);
				Y2 = new BigDecimal(y2);
				Y3 = new BigDecimal(y3);
				Y4 = new BigDecimal(y4);
				dx1 = X1.subtract(X2); 
				dy1 = Y1.subtract(Y2);
				dx2 = X3.subtract(X4);
				dy2 = Y3.subtract(Y4);
				l1 = dx1.divide(dy1, 5,BigDecimal.ROUND_HALF_UP);
				l2 = dx2.divide(dy2, 5,BigDecimal.ROUND_HALF_UP);
				
				if(l1.equals(l2)){
					result[i] = true;
				} else {
					result[i] = false;
				}
			}
		}
		for(int i = 0; i < n; i++){
			if(result[i] == true){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}