import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double K = sc.nextDouble();
		ArrayList<Integer> ary = new ArrayList<Integer>();
		int num = (int)K;
		while(num != 1) {
			ary.add(num);
			num = (int)Math.ceil((double)num / (double)2);
		}
		ary.add(1);
		
		if(N >= K) {
			double ans = 0;
			int cnt = 0;
			for(int i = (int)N; i > 0; i--) {
				if(i > K) {
					ans += 1 / N;
				} else {
				while(ary.get(cnt) > i) {
					cnt++;
				}
				ans += Math.pow(0.5, cnt) / N; 
				}
			}
			System.out.println(ans);
		} else {
			double ans = 0;
			int cnt = 0;
			for(int i = (int)N; i > 0; i--) {
				while(ary.get(cnt) > i) {
					cnt++;
				}
				ans += Math.pow(0.5, cnt) / N; 
			}
			System.out.println(ans);
		}
	}
}
