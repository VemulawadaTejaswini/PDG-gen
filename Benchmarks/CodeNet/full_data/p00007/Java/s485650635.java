import java.util.*;
import java.math.*;
 class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 100000;
		for(int i=0;i<n;i++){
			sum=sum+sum*0.05;
			BigDecimal bi = new BigDecimal(String.valueOf(sum));
			sum = bi.setScale(-3,BigDecimal.ROUND_UP).doubleValue();
		}
		System.out.printf("%.0f\n",sum);
	}
}