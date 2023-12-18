import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();//
		int m = sc.nextInt();//

		int[] x = new int[m]; 
		for(int i = 0; i < m; i++){
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);

		int[] sabun = new int[m - 1];
		for(int i = 0; i < m - 1; i++){
			sabun[i] = x[i + 1] - x[i];
		}
		
		Arrays.sort(sabun);

		int minStep = 0;
		if(n < m){
			for(int i = 0; i < m - n; i++){
				minStep = minStep + sabun[i];
			}
		}

		// 出力
		System.out.println(minStep);
	}

}


