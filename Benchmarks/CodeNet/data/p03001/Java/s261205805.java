import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int x1,x2,y1,y2;
		double minX,minY;
		int hukusu;
		double menseki;
		sc.close();

		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		minX = 0;
		minY = 0;
		hukusu = 0;

		//X軸の最小面積を求める
		x1 = x*H;
		x2 =(W-x)*H;
		if(x1>x2) {
			minX = x2;
		}else {
			minX = x1;
		}
		//Y軸の最小面積を求める
		y1 = y*W;
		y2 =(H-y)*W;
		if(y1>y2) {
			minY = y2;
		}else {
			minY = y1;
		}

		//最大の面積を求める
		if (minX > minY) {
			menseki = minX;
		}else {
			menseki = minY;
		}
		//複数あるか確認
		if(minX == minY) {
			hukusu = 1;
		}
		System.out.println(String.format("%.6f", menseki) +" "+ hukusu );
	}

}
