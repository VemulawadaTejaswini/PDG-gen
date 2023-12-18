import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2019/06/09
 * AtCoder Beginner Contest 129
 * 
 * C - Typical Stairs
 * 
 * @author rued97
 */
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> as = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			as.add(sc.nextInt());
		}
		
		long pre1 = 0;
		long pre2 = 1;
		long now = 0;
		
		for(int i = 1; i <= N; i++) {
			if(as.contains(i)) {
				now = 0;
			} else {
				now = pre1 + pre2;
			}
			pre1 = pre2;
			pre2 = now;
			if(pre1 == 0 && pre2 == 0) {
				break;
			}
		}
		
		long result = now % 1000000007;
		System.out.println(result);
	}
	
}