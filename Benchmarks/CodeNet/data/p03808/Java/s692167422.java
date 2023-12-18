
import java.util.*;

public class Main{
	// 提出時にはクラス名をMainに
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numBox = scan.nextInt();
		int[] stone = null;
		if(numBox > 0){
			stone = new int[numBox];
		}
		int sumStone = 0;
		for(int i = 0; i < numBox; i++){
			stone[i] = scan.nextInt();
			sumStone += stone[i]; // <- 石の合計を格納　ちょうど0になったら成功
		}
		
		// 状態の準備完了
		for(int i = 0; i < numBox; i++){
			int j = 0;
			int tmpstone[] = new int[numBox];
			for(int k = 0; k < tmpstone.length; k++){
				tmpstone[k] = stone[k];
			}
			int tmpsum = sumStone;
			while(true){
				//System.out.println("i = " + i + " j = " + j );
				if(tmpstone[(i + j) % numBox] >= j){
					tmpstone[(i + j) % numBox] -= j;
					tmpsum -= j;
					//System.out.println("tmpsum = " + tmpsum);
				} else {
					break;
				}
				j++;
				
			}
			//System.out.println("tmpsum = " + tmpsum);
			if(tmpsum == 0){
				System.out.println("YES");
				return;
			} 
			
			
		}
		
		System.out.println("NO");
	}
}