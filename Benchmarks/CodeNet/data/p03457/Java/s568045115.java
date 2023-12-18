import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// 中間ポイントの数

		int[] p = new int[n * 3];
		for(int i = 0; i < n * 3; i++){
			p[i] = sc.nextInt();
		}

		//
		String result = "Yes";
		for(int i = 0; i < n; i++){

			int t = 0;
			int x = 0;
			int y = 0;

			if(i == 0){
				t = p[i * 3];
				x = p[i * 3 + 1];
				y = p[i * 3 + 2];
			}else{
				t = p[i * 3] - p[(i - 1) * 3];
				x = p[i * 3 + 1] - p[(i - 1) * 3 + 1];
				y = p[i * 3 + 2] - p[(i - 1) * 3 + 2];
			}
			
			if(!canGo(t, x, y)){
				result = "No";
				break;
			}
		}

		// 出力
		System.out.println(result);
	}

	// 移動可能か
	static boolean canGo(int t, int x, int y){
		//System.out.print("t:" + t + " x:" + x + " y:" + y);

		// 制約条件
		if(t < abs(x) + abs(y)){
			// System.out.println(" No(条件１)");
			return false;
		}
		if(t%2 != abs(x + y)%2){
			// System.out.println(" No(条件２)");
			return false;
		}

		// System.out.println(" Yes");
		return true;
	}
}


