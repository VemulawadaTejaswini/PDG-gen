import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++){
		    l[i] = sc.nextInt();
		}

		// 計算
	    int result = 0;
	    Arrays.sort(l);
	    for(int i = 0; i < n; i++){
		    for(int j = i + 1; j < n; j++){
		        int k = j + 1;
		        while(k < n && l[k] - l[j] < l[i]) k++;
		        result += k - (j + 1);
		    }
		}

		// 出力
		System.out.println(result);
        
	}
}
