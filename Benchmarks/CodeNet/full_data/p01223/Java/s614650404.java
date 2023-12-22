
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//データセット数
		int dataSetCount = sc.nextInt();
		for(int i = 0;i<dataSetCount;i++) {
			//比較対象の2つのブロック
			int currentBlock;
			int nextBlock;
			//出力する最大の上りと下り
			int climbUp = 0;
			int climbDown = 0;
			//ブロックの数
			int blockCount = sc.nextInt();
			currentBlock = sc.nextInt();
			for(int j = 1;j< blockCount;j++) {
				nextBlock = sc.nextInt();
				//段差
				int climb = currentBlock - nextBlock;
				//段差がプラスかマイナスかで上りか下りかを判別
				//最大である場合、更新する
				if(climb > 0) {
					if(climb > climbUp) {
						climbUp = climb;
					}
				}else {
					if(climb < climbDown) {
						climbDown = climb;
					}
				}
				//ブロックを更新
				currentBlock = nextBlock;
			}
			//マイナスを絶対値へ変更し、出力
			System.out.println(Math.abs(climbDown) + " " + climbUp);
			
		}
	}
}

