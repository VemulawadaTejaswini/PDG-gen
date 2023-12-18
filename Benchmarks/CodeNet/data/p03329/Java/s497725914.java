import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] money = new int[]{0,1,6,9,36,216,1296,7776,46656,81,729,6561,59049};
		Arrays.sort(money);
		int[] cost = new int[N+1];      
		for( int i=1; i<=N; i++ ){
			cost[i] = cost[i-1]+1;          
			for( int k=1; k<=12; k++ ){             
				if( i>=money[k] ){                  
					int m = i/money[k];           
					cost[i] = Math.min( cost[i],cost[i-money[k]*m]+m );
				}               
			}          
		}   
		System.out.println(cost[N]);
	}
}
