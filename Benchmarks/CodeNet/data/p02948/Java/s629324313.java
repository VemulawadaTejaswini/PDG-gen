import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] list = new int[n][2];
	    for(int i = 0; i < n; i++){
	        list[i][0] = sc.nextInt();
	        list[i][1] = sc.nextInt();
		}
		
		// 計算
		int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());		
        for(int i = 1; i < m + 1; i++){
            for(int j = 0; j < n; j++){
                if(list[j][0] == i) pq.add(list[j][1]);
            }
        
            if(pq.size()>0)sum = sum + pq.poll();
        }

		// 出力
        System.out.println(sum);
		
	}
}
