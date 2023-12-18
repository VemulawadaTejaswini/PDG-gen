import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		int cnt =0;	//裏向きのカードの枚数
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// N行
		int m = sc.nextInt();// M列
		int[][] cellAry = new int[n][m];
 
		// 表を1、裏を-1として、全てのカードを表に設定
		for(int[] tmpAry : cellAry) {
		Arrays.fill(tmpAry, 1);
		}
		/*
		 * 裏返しにする対象のマスは、現在のマスを（x,y)としたとき、
		 * (x-1,y-1),(x-1,y-0),(x-1,y+1),
		 * (x-0,y-1),(現在マス),(x-0,y+1),
		 * (x+1,y-1),(x+1,y-0),(x+1,y+1)
		 */
		// 全てのマスを一つずつ選択して判定
		for(int x=0;x<cellAry.length;x++) {
			for(int y=0;y<cellAry[x].length;y++) {
 
				for(int i = -1;i<=1;i++) {
					for(int j = -1;j<=1;j++) {
						// 現在のマスのときはスキップ
						if(i==0&&j==0) {
							continue;
						}
						try {
						cellAry[x-i][y-j] *= -1;
						// 配列エラーが起こっても処理を止めないようにする
						}catch(ArrayIndexOutOfBoundsException e) {
 
						}
					}
				}
			}
		}
		// 裏を向いている（要素が-1）のカードを数える
		for(int[] tmpAry : cellAry) {
			for(int tmp : tmpAry) {
				if(tmp==-1) {
					cnt++;
				}
			}
		}
		// 結果をコンソールに表示
		System.out.println(cnt);
 
	}
}