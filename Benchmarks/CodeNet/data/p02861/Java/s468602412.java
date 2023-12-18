import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigDecimal x[],y[];
		x=new BigDecimal[N];
		y=new BigDecimal[N];
		for (int i=0;i<N;i++) {
			int x1,y1;
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x[i] = new BigDecimal(x1);
			y[i] = new BigDecimal(y1);
		}
		int c =2;
		for(int i=2;i<=N;i++ ) {
			c*=i;
		}
		c=c/N;
		int C =1;
		for(int i=2;i<=N;i++ ) {
			C*=i;
		}
		BigDecimal sum = new BigDecimal(0);
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				BigDecimal x1 = x[i].add(x[j].multiply(new BigDecimal(-1)));
				BigDecimal y1 = y[i].add(y[j].multiply(new BigDecimal(-1)));
				x1= x1.multiply(x1);
				y1= y1.multiply(y1);
				x1 = x1.add(y1);
				x1 = Main.sqrt(x1,10);
				sum = sum .add(x1);
			}
		}
		sum = sum.multiply(new BigDecimal(c));
		sum =sum.divide(new BigDecimal(C),10,BigDecimal.ROUND_HALF_UP);
		System.out.println(sum.toPlainString());
	}

	public static BigDecimal sqrt(BigDecimal value, int scale){
	    BigDecimal num2 = BigDecimal.valueOf(2);
	    int precision = 100;
	    MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
	    BigDecimal deviation = value;
	    int cnt = 0;
	    while (cnt < precision) {
	        deviation = (deviation.add(value.divide(deviation, mc))).divide(num2, mc);
	        cnt++;
	    }
	    deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
	    return deviation;
	}
}