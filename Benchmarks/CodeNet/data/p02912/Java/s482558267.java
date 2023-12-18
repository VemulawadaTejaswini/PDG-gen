import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Comparator.reverseOrder());
		for(int i = 0; i < n; i++){
		    pq.add(sc.nextLong());
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < m; i++){
		    long temp = pq.poll();
		    temp = temp/2;
		    pq.add(temp);
		}
		for(int i = 0; i < n; i++){
		    result += pq.poll();
		}
		// 出力
		System.out.println(result);
		
	}
}
