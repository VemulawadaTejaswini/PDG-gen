//書き換え中
//テストケースは通った
//メモリ使用量が多すぎてREが出る

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[] whereH = new int[m];
		int[] whereW = new int[m];
		int[] countHeight = new int[h+1];//縦に見たときの爆弾の個数
      	int[] countWide = new int[w+1];//横に見たときの爆弾の個数
		for(int i = 0; i < m; i++){
			int hi = sc.nextInt();
			int wi = sc.nextInt();
			whereH[i] = hi;
			whereW[i] = wi;
			countHeight[hi]++;
          	countWide[wi]++;
		}
		sc.close();
		//countHeightとcountWideの最大値計算
		int maxH = 0;
		int maxW = 0;
		for(int i = 0; i <= h; i++){
			if(countHeight[i] > maxH){
				maxH = countHeight[i];
			}
		}
		for(int i = 0; i <= w; i++){
			if(countWide[i] > maxW){
				maxW = countWide[i];
			}
		}
      	//最大となる場所に爆弾が存在するか
		int exist = 0;
      	int notExist = 0;
		
		for(int i = 0 ; i < m; i++){
			if(countWide[whereW[i]] > 0 && countHeight[whereH[i]] > 0) exist++;
			else notExist++;
		}
		
		if(notExist>0) System.out.println(maxH+maxW);
		else  System.out.println(maxH+maxW-1);
	}
}