package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int matrix[][] = {
				// お菓子
				{ 0, 0, 1 }, // すぬけ
				{ 0, 0, 0 },
				{ 0, 0, 0 },
		};

		int sunuke[] = new int[] { 0, 0 , 0};

		// 行
		for (int i = 0; i < matrix.length; i++) {

			int c = 0;
			// 列
			for (int j = 0; j < matrix[0].length; j++) {

				//System.out.println(j + "番目" + matrix[i][j]);

				//1が立ってたらカウント
				if (matrix[i][j] == 1) {
					c++;
				}

			}
			
			// お菓子をもってるすぬけを記録
			sunuke[i] = c;
		}

		//System.out.println(sunuke[0] + " " + sunuke[1] +" " + sunuke[2]);

		int count=0;
		//0の数カウント
		for(int i = 0; i < sunuke.length; i++) {
			if(sunuke[i] == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}
