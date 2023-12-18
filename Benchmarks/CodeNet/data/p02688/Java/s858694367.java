//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int K = sc.nextInt();
		
		boolean judge[] = new boolean[N];
		Arrays.fill(judge, true);
		
		for(int i=0;i<K;i++) {
			int d = sc.nextInt();
			for(int j=0;j<d;j++) {
				int a = sc.nextInt();
				judge[a-1] = false;
			}
			//System.out.println(d);
		}
		int count = 0;
		for(int l=0;l<N;l++) {
			if(judge[l]) {
				count ++;
			}
		}
		
		System.out.println(count);
	}
}
