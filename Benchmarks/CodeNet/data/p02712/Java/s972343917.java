//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//Map<Integer,Integer> map = new TreeMap<Integer,Integer>()
		long ans = 0;
		for(int i=1;i<N+1;i++) {
			if(i%3==0||i%5==0) {
				continue;
			}
			ans = ans + i;
		}
		System.out.println(ans);
	}
}