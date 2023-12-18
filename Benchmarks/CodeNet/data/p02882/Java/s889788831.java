import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		double kakudo;
		double yuyo;
		double waterLevel = x/(Math.pow(a, 2));



		yuyo = b - waterLevel;
		kakudo = Math.atan(1);
		kakudo = kakudo*180.0/Math.PI;
		System.out.println(kakudo);

		sc.close();
	}
};

