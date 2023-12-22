import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//入力された値がdoubleのとき
		//入力された値を半径とした円の面積と円周を出力する
		if(sc.hasNextDouble()){
			double r = sc.nextDouble();
			double menseki = Math.PI * r * r;
			double ensyuu = Math.PI * r * 2;
			
			System.out.printf("%.6f %.6f\n", menseki, ensyuu);
		}
	}
}

