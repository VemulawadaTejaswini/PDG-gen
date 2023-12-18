import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++){
		    v[i] = sc.nextInt();
		}

		// 計算
		int result = 0;
		for(int l = 0; l < k + 1; l++){
		    for(int r = 0; r < k - l + 1; r++){
		        if(l + r > n) break;
		        int sum = 0;
		        PriorityQueue<Integer> s = new PriorityQueue<Integer>();
		        //System.out.println("l: " + l + " r: " + r);
		        for(int i = 0; i < l; i++){
		            s.add(v[i]);
		            sum += v[i];
		            //System.out.println("add: " + v[i] + " sum: " + sum);
		        }
		        for(int i = r; i > 0; i--){
		            s.add(v[n - i]);
		            sum += v[n - i];
		            //System.out.println("add: " + v[i] + " sum: " + sum);
		        }
		        for(int d = 0; d < k - l - r; d++){
		            if(s.size() == 0) break;
		            if(s.peek() >= 0) break;
		            //System.out.println("del: " + s.peek());
		            sum -= s.poll();
		            
		        }
		        //System.out.println("result: " + result + " sum:" + sum);
		        result = max(result, sum);
		    }
		}

		// 出力
		System.out.println(result);
	}
}