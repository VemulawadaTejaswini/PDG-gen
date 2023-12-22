import java.util.Scanner;

/**
* 円周率はフィールドMath.PIで保持されている。
* 累乗計算を行うメソッドはMath.pow(double a, double b) a*b回
* %.10f →浮動小数点を10桁まで表示
*/
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();

//  自作　失敗		
//		System.out.printf("%f %f%n", (double)r*r*3.14, (double)2 * 3.14 * r);
 		System.out.printf("%f %f%n", r*r*Math.PI, r*2*Math.PI);
	}

}
