import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] info = new int[n][3];
		for(int i = 0; i < n; i++){
		    info[i][0] = sc.nextInt();
		    info[i][1] = sc.nextInt();
		    info[i][2] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[3];
		int calcH = -1;
		int s = 0;
		int t = 0;
		int u = 0;
		for(int i = 0; i < n; i++){
		    if(info[i][2] != 0){
		        s = info[i][0];
		        t = info[i][1];
		        u = info[i][2];
		    }
		}
		for(int x = 0; x <= 100; x++){
		    for(int y = 0; y <= 100; y++){
		        calcH = abs(x - s) + abs(y - t) + u;
		        boolean check = true;
		        for(int i = 0; i < n; i++){
		            if(info[i][2] == 0) continue;
		            if(calcH != abs(x - info[i][0]) + abs(y - info[i][1]) + info[i][2]) check = false;
		        }
		        if(check){
		            result[0] = x;
		            result[1] = y;
		            result[2] = calcH;
		        }
		    }
		}
		// 出力
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
		
	}
}