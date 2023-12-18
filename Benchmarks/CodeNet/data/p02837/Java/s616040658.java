import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		ArrayList<Integer[][]> list = new ArrayList<Integer[][]>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    Integer[][] xy = new Integer[a][2];
		    for(int j = 0; j < a; j++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        xy[j][0] = x;
		        xy[j][1] = y;
		    }
		    list.add(xy);
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < (1<<n); i++){
		    String s = Integer.toString(i, 2);
		    boolean bool = true;
		    for(int j = 0; j < n; j++){
		        if(((i>>j) & 1) == 1){
		            Integer[][] a = list.get(j);
		            for(int k = 0; k < a.length; k++){
		                int index = a[k][0]-1;
		                int tf = a[k][1];
		                if(s.length()-1-index >= 0 && (s.charAt(s.length()-1-index)-'0') != tf){
		                    bool = false;
		                    break;
		                }else if(s.length()-1-index < 0 && tf == 1){
		                    bool = false;
		                    break;
		                }
		            }
		        } 
		        if(!bool) break;
		    }
		    if(bool) result = max(result, Integer.bitCount(i));
		}
		
		// 出力
		System.out.println(result);
	}
}
