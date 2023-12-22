

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("##########.##########");
		
		//半径
		double radius = sc.nextDouble(); 
		//面積
		double area = radius*radius*Math.PI;
		//周の長さ
		double circuit = radius*2*Math.PI;
		
		System.out.print(df2.format(area)+" "+df2.format(circuit));
		
	}

}