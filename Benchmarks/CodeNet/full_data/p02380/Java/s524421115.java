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

		// 角度をラジアンで指定
		double radianC = Math.toRadians(angleC);

//		double area = sideA * sideB / 2;
		double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(radianC));
//		System.out.println(area);
		double length = sideA + sideB + sideC;
		// ヘロンの公式を使って面積を計算
//		double area = length / 2;
		double area = 0.5 * sideA * sideB * Math.sin(radianC);
		System.out.println(area);
		System.out.println(length);
//		double height = sideB;
		// b*sinCを求めるためにbとa
		double height = sideB * Math.sin(radianC);
		System.out.println(height);

		sc.close();

	}

}
