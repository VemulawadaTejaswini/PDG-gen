
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
		
		// 石の合計は等差数列の和となってるはず
		int n = 0;
		int tmp = 0;
		while(tmp < sumStone){
			n++;
			tmp = n * (n + 1) / 2;
		}
		int times = n / numBox;
		// timesは何周したかを示す
		
		if(tmp != sumStone){
			System.out.println("NO");
			return;
		} 
		
		for(int i = 0; i < numBox; i++){
			if(stone[i] == numBox * times){
				boolean flag = true;
				for(int j = 1; j < numBox; j++){
					if(j <= n - times * numBox){
						if(stone[(i + j) % numBox] != numBox * times + j * times){
							flag = false;
							break;
						}
					} else {
						if(stone[(i + j) % numBox] != numBox * (times - 1) + j * (times)){
							flag = false;
							break;
						}
					}
				}
				if(flag){
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
}