//書き換え中
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[][] box = new int[h+1][w+1];
		int[] countHeight = new int[h+1];//縦に見たときの爆弾の個数
      	int[] countWide = new int[w+1];//横に見たときの爆弾の個数
		for(int i = 0; i < m; i++){
			int hi = sc.nextInt();
			int wi = sc.nextInt();
			box[hi][wi] = 1;//爆弾があれば+1
			countHeight[hi]++;
          	countWide[wi]++;
		}
		
		//countHeightとcountWideの最大値
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
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(box[i][j] ==1 && countWide[j] == maxW && countHeight[i] == maxH){
					exist++;
				}else if(box[i][j] !=1 && countWide[j] == maxW && countHeight[i] == maxH){
                	notExist++;
                }
			}
		}
		if(notExist>0) System.out.println(maxH+maxW);
		else  System.out.println(maxH+maxW-1);
	}
}