/*
 * r s p グーチョキパー
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
//		Scanner scan1 = new Scanner(System.in);
		int R = scan.nextInt();
		int S = scan.nextInt();
		int P = scan.nextInt();
//		Scanner scan2 = new Scanner(System.in);
		String a = scan.next();
		String array[] = a.split("");
		MustVictoryJanken(array,N);
		EfficentPointJanken(array,N,K);
		System.out.print(SumPint(array,N,R,S,P));

		/* デバック用
		for(int i = 0; i < N; i++) {
			System.out.print(array[i]);
		}
		*/

	}

	/*
	 * 必ずじゃんけんに勝利するパターン
	 */
	public static void MustVictoryJanken(String array[],int N) {
		for(int i = 0; i < N; i++) {
			if(array[i].equals("r")) {
			array[i] = "p";
			}else if(array[i].equals("s"))  {
			array[i] = "r";
			}else if(array[i].equals("p"))  {
			array[i] = "s";
			}
		}
	}

	/*
	 * K回前とかぶらないようにじゃんけんして最も得点が高くなるパターン
	 */
	public static void EfficentPointJanken(String array[],int N,int K) {
		for(int i=1; i < N; i++) {
		//もし回前がマイナスにならない場合
			if(i - K > -1) {
				if(array[i] == array[i - K]) {
				array[i] = "あいこ";
				}
			}
		}
	}

	public static int SumPint(String array[],int N,int R,int S,int P) {
		int sum = 0;
		for(int i=0; i<N; i++) {
			switch(array[i]) {
			case "r":
				sum += R;
				break;
			case "s":
				sum += S;
				break;
			case "p":
				sum += P;
				break;
			}
		}
		return sum;
	}


}
