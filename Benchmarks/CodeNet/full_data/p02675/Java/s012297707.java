import java.util.*;
public class Main {
	public static void main(String[] args){
    //標準入力のインスタンス作成
		Scanner sc = new Scanner(System.in);
		// 数値の入力
		double A = sc.nextDouble();//Acm
		double B = sc.nextDouble();//Bcm
		double H = sc.nextDouble();//H時間
		double M = sc.nextDouble();//M分
		//長短針間の角度を計算
		double theta_a = 30*(H+M/60);
		double theta_b = 360*(M/60);
		double theta_ab = Math.abs(theta_a-theta_b);
		//余弦定理で距離計算
		double C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(theta_ab/180*Math.PI));
		// 出力
		System.out.println(C);
	}
}
