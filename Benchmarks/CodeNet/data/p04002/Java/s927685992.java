import java.util.HashMap;
import java.util.Scanner;
public class Main {
	static int[] vx = {-2,-1,0,1,2};
	static int[] vy = {-2,-1,0,1,2};
		static HashMap<Long, Integer> map = new HashMap<Long,Integer>();
		static HashMap<Long, Integer> check = new HashMap<Long,Integer>();
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = sc.nextInt()-1;
				b[i] = sc.nextInt()-1;
				map.put(a[i] * 1000000001L + b[i], 1);
			}
			long[] ans = new long[10];
			for(int i = 0; i < N; i++) {
				long y = a[i];
				long x = b[i];
				for(int j = 0; j < vx.length; j++) {
					for(int k = 0; k < vy.length; k++) {
						long ty = y + vy[j];
						long tx = x + vx[k];
						if(ty + 2 >= H || tx + 2 >= W || ty < 0 || tx < 0) continue;
						long ss = ty * 1000000001L + tx;
						if(check.containsKey(ss)) continue;
						check.put(ss, 1);
						int sum = 0;
						for(int l = 0; l < 3; l++) {
							for(int m = 0; m < 3; m++) {
								long cy = ty + l;
								long cx = tx + m;
								long sss = cy * 1000000001L + cx;
								if(map.containsKey(sss)) sum++;
							}
						}
						ans[sum]++;
					}
				}
			}
			long ssx = (long)(H-2) * (W-2);
			for(int i = 1; i < 10; i++) {
				ssx -= ans[i];
			}
			ans[0] = ssx;
			for(int i = 0; i < 10; i++) {
				System.out.println(ans[i]);
			}
			
		}

}
