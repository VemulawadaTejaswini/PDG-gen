import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long num = 0;
		long min = 1000000000;
		long max = -1000000000;
		long diff =0;
		long ans = 1000000000;
		ArrayList<Long> numbers = new ArrayList<Long>();
		for(int i = 0; i < n; i++){
			long j = sc.nextLong();
			numbers.add(j);
			min = Math.min(min, j);
			max = Math.max(max, j);
		}
		min -= n;
		//最小から最大で試す
		for(long i = min; i < max; i++){
			long i_copy = i;
			for(long j = 0; j < n; j++){
				diff += Math.abs(numbers.get((int)j) - i_copy);
				i_copy++;
			}
			ans = Math.min(ans, diff);
			diff = 0;
		}
		System.out.println(ans);
	}
}
