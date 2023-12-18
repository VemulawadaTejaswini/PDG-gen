/*
 *　026 - A
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int slime_Num;
		String slime_Str;
		int[] slime1 = new int[10000];
		int[] slime2 = new int[10000];
		int i;
		int kekka1;
		int kekka2;

		// スライム数とスライムの種類列を入力
		slime_Num = scan1.nextInt();
		slime_Str = scan2.nextLine();

		String[] result = slime_Str.split(" ");

		for(i = 0; i < result.length ; i++) {
			slime1[i] = Integer.parseInt(result[i]);
		}

		System.arraycopy(slime1,0,slime2,0,result.length);

		kekka1 = Comp_Num.Comp1(slime1 , result.length , slime_Num);
		kekka2 = Comp_Num.Comp2(slime2 , result.length , slime_Num);

		//結果を表示
		if(kekka1 <= kekka2) {
			System.out.println(kekka1);
		}else {
			System.out.println(kekka2);
		}

	}

}

//比較用のクラス
class Comp_Num{

	static int Comp1(int[] slime, int length, int slime_Num){

		int before = slime[0];
		int after;
		int kaisu = 0;

		for(int i = 1; i < length; i++) {
			if(i + 1 < length) {
				after = slime[i + 1];
			}else {
				after = 0;
			}
			if(before == slime[i]) {
				if(slime_Num == 2 ) {
					if(before == 1) {
						slime[i] = 2;
					}else {
						slime[i] = 1;
					}
				}
				for(int j = 1; j <= slime_Num ;j++) {
					if(j != before && j != after) {
						slime[i] = j;
					}
				}
				kaisu++;
			}
			before = slime[i];
		}
		return kaisu;
	}

	static int Comp2(int[] slime, int length, int slime_Num){

		int x;
		int y;
		int kaisu;

		for(int i = 0; i < (int)(length / 2) ; i++) {
			x = slime[i];
			y = slime[length - (1 + i)];
			slime[length - (1 + i)] = x;
			slime[i] = y;
		}

		kaisu = Comp1(slime, length, slime_Num);
		return kaisu;

	}

}

