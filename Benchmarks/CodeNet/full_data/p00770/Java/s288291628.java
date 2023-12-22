import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
 
public class Main {
	     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int pm = 1000000;
		boolean[] prime = new boolean[pm+10000];
		for(int i=2;i<=pm;i++) prime[i] = true;
		for(int i=2;i<=pm+1;i++){
			for(int j=i+i;j<=pm;j+=i){
				prime[j] = false;
			}
		}
		
		int[][] map = new int[1010][1010];
		Point2D.Double[] p = new Point2D.Double[1100000];
		int x = 500;
		int y = 500;
		int z = 1;
		int cnt = 1;
		boolean flag = true;
		while(true){
			if(flag==true){
				for(int i=0;i<z;i++){
					map[y][x] = cnt;
					p[cnt] = new Point2D.Double(x, y);
					cnt++;
					x++;
				}
				for(int i=0;i<z;i++){
					map[y][x] = cnt;
					p[cnt] = new Point2D.Double(x, y);
					cnt++;
					y--;
				}
				flag = false;
			}else if(flag==false){
				for(int i=0;i<z;i++){
					map[y][x] = cnt;
					p[cnt] = new Point2D.Double(x, y);
					cnt++;
					x--;
				}
				for(int i=0;i<z;i++){
					map[y][x] = cnt;
					p[cnt] = new Point2D.Double(x, y);
					cnt++;
					y++;
				}
				flag = true;
			}
			z++;
			if(cnt>1003000) break;
		}


		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int s = (int)p[m].x;
			int t = (int)p[m].y;
			ArrayDeque<Integer> q = new ArrayDeque<Integer>();
			ArrayDeque<Integer> r = new ArrayDeque<Integer>();
			int[][] dp = new int[1002][1002];
			for(int i=0;i<1002;i++) Arrays.fill(dp[i], -1);
			dp[t][s] = 0;
			q.offer(s);
			r.offer(t);
			int num = 0;
			int max = 0;
			if(prime[m]==true){
				dp[t][s] = 1;
				max = 1;
				num = m;
			}
			
			int u, v;
			while(q.size()!=0){
				s = q.poll();
				t = r.poll();
				for(int i=-1;i<=1;i++){
					v = map[t+1][s+i];
					if(0<=s+i && s+i<=1000 && v<=n){
						if(prime[v]==true){
							if(dp[t+1][s+i]<dp[t][s]+1){
								dp[t+1][s+i] = dp[t][s]+1;
								q.offer(s+i);
								r.offer(t+1);
								if(dp[t+1][s+i]>max){
									max = dp[t+1][s+i];
									num = v;
								}else if(dp[t+1][s+i]==max){
									num = Math.max(num, v);
								}
							}
						}else{
							if(dp[t+1][s+i]<dp[t][s]){
								dp[t+1][s+i] = dp[t][s];
								q.offer(s+i);
								r.offer(t+1);
							}
						}
					}
				}
			}
			System.out.println(max + " " + num);
		}
    }   
}