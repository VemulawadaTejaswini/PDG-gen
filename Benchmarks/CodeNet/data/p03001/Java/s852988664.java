import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w=sc.nextDouble(),h=sc.nextDouble(),x=sc.nextDouble(),y=sc.nextDouble();
		double sum=w*h;
		if(w/h==x/y) {
			System.out.println(BigDecimal.valueOf(sum/2).toPlainString()+" "+1);
		}else if(x==0&&y==0) {
			System.out.println(BigDecimal.valueOf(sum/2).toPlainString()+" "+1);
		}else{
			double res=Math.max(Math.min(w-x,x)*h, w*Math.min(y, h-y));
			System.out.println(BigDecimal.valueOf(res).toPlainString()+" "+0);
		}
	}
}

