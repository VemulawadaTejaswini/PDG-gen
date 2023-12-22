import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double pi = Math.PI;//円周率
		double menseki = r * r * pi;//面積算出
		double ensyu = 2 * r * pi;//円周算出
		System.out.printf("%.6f %.6f",menseki,ensyu);//計算結果を６桁で表示
		
	}
}