import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static int cnt = 0;
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		}

		// 計算
		int result = 0;
		dfs(h);
		result = cnt;
		// 出力
		System.out.println(result);
        
	}
	
	static void dfs(int[] a){
	    //System.out.println(Arrays.toString(a));
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int min = 1000;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] < min) min = a[i];
	    }
	    cnt += min;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] == min) list.add(i);
	    }
	    list.add(a.length);
	    int l = 0;
	    for(int i = 0; i < list.size(); i++){
	        int r = list.get(i);
	        int len = r - l;
	        if(len > 0){
	            int[] next = new int[len];
	            for(int j = l; j < l + len; j++){
	                next[j - l] = a[j] - min;
	            }
	            dfs(next);
	        }
	        l = r + 1;
	    }
	}
}
