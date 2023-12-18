import java.util.*;
import static java.lang.Math.*;

public class Main {
    
    static int[] a;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] bool = new boolean[n];
		for(int i = 0; i < k; i++){
		    int d = sc.nextInt();
		    for(int j = 0; j < d; j++){
		        bool[sc.nextInt()-1] = true;
		    }
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    if(!bool[i]) result++;
		}
		
		
		// 出力
		System.out.println(result);
	}
}
