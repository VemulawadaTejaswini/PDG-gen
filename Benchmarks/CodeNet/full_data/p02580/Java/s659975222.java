import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[] whereH = new int[m];//爆弾の位置
		int[] whereW = new int[m];//爆弾の位置
		int[] countHeight = new int[h+1];//爆弾の個数
      	int[] countWide = new int[w+1];//爆弾の個数
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
		//maxになる場所の個数
      	int countMaxW = 0;
      	int countMaxH = 0;
      	for(int i = 0; i <= h; i++){
			if(countHeight[i] == maxH){
				countMaxH++;
			}
		}
		for(int i = 0; i <= w; i++){
			if(countWide[i] == maxW){
				countMaxW++;
			}
		}
      
      	long maxCount = countMaxH*countMaxW;
      	
      	for(int i = 0; i < m; i++){
        	if(countWide[whereW[i]] == maxW && countHeight[whereH[i]] == maxW){
            	maxCount--;
            }
        }
      
		if(maxCount!=0) System.out.println(maxH+maxW);
		else  System.out.println(maxH+maxW-1);
	}
}