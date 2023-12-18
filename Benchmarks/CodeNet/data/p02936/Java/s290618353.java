import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[][] e = new int[n - 1][2];
		int[][] ope = new int[q][2];
		
	    for(int i = 0; i < n - 1; i++){
			e[i][0] = sc.nextInt();
			e[i][1] = sc.nextInt();
		}
		
		int[] result = new int[n];
		Arrays.fill(result, 0);

	    for(int i = 0; i < q; i++){
			ope[i][0] = sc.nextInt();
			ope[i][1] = sc.nextInt();
			result[ope[i][0] - 1] += ope[i][1];
		}
		
		//Arrays.sort(e, (a, b) -> Integer.compare(a[0], b[0]));
		
		// 計算
        for(int i = 0; i < n - 1; i++){
            result[e[i][1] - 1] += result[e[i][0] - 1];
        }

		// 出力
        for(int i = 0; i < n; i++){
            System.out.print(result[i]);
            System.out.print(" ");
        }
		
	}
}
