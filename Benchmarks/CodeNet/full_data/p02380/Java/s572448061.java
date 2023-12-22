import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sideA = sc.nextInt();
		int sideB = sc.nextInt();
		int angleC = sc.nextInt();

		// 高さを求める
//		double h = sideB * Math.sin(angleC);
//		// 面積を求める
//		double area = sideB * h / 2;
//		System.out.println(h);
//		System.out.println(area);

		double area = sideA * sideB / 2;
		double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		System.out.println(area);
		double length = sideA + sideB + sideC;
		System.out.println(length);
		double height = sideB;
		System.out.println(height);

		sc.close();

	}

}
