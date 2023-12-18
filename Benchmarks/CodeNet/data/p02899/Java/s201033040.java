import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] array = new int[n][2];
		
		for(int i = 0; i < n; i++){
		    array[i][0] = i + 1;
		    array[i][1] = sc.nextInt();
		}
		Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));

		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(array[i][0] + " ");
		}
        
	}
}
