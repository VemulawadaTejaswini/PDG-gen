import java.util.Scanner;

/**
 * https://abc063.contest.atcoder.jp/tasks/arc075_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		long[] h = new long[N];
		long max = 0;
		for(int i=0; i<N; i++){
			h[i] = Long.parseLong(sc.next());
			max = Math.max(max, h[i]);
		}
		sc.close();
		
		long left = 1;
		long right = (long)N*max/(long)B;
		long ans = right;
		while(left<=right){
			long mid = (left+right)/2;
			if(check(mid,h,A,B)){
				ans = Math.min(ans,mid);
				right = mid-1;	
			}else{
				left = mid+1;
			}
		}
		
		System.out.println(ans);

	}

	private static boolean check(long t, long[] h, long A, long B) {
		long count = 0;
		for(int i=0; i<h.length; i++){
			if(h[i]>B*t){
				count = count + (long)Math.ceil((double)(h[i]-B*t)/(A-B));
			}
		}
		return count<=t;
	}

}
