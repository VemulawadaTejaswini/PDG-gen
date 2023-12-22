import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		double r, ce, cf;
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		//キーボードからr(半径の値)を入出力
		ce = Math.pow(r,2)*Math.PI;
		//円の面積⇒r二乗*円周率
		cf = 2*r*Math.PI;
		//円周⇒2*r*円周率
		System.out.printf("%f %f",ce,cf);
		//計算結果を10進数の形式で出力
	}
}