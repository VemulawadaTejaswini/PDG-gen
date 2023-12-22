import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[][] box = new int[h+1][w+1];
		for(int i = 0; i < m; i++){
			int hi = sc.nextInt();
			int wi = sc.nextInt();
			box[hi][wi] = 1;
		}
		
		//各行・列の爆弾の数を数える
		int[] countWide = new int[w+1];
		int[] countHeight = new int[h+1];
		
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(box[i][j] == 1){
					countWide[i]++;
					countHeight[j]++;//エラー
				}
			}
		}
		
		//一番爆弾が多い行・列を探す
		int whereMaxH = 0;
		int whereMaxW = 0;
		int max = 0;
		
		for(int i = 1; i <= h; i++){
			if(countHeight[i] > max){
				whereMaxH = i;
				max = countHeight[i];
			}
		}
		for(int i = 1; i <= w; i++){
			if(countWide[i] > max){
				whereMaxW = i;
				max = countWide[i];
			}
		}
		//一番多い行＋列-1で最大数が出るはずだった
		if(box[whereMaxH][whereMaxW] ==1){
			System.out.println(countWide[whereMaxW] + countHeight[whereMaxH] -1);
		}else{
			System.out.println(countWide[whereMaxW] + countHeight[whereMaxH]);
		}
	}
}