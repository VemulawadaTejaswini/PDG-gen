import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		int x[] = new int[n];
		int y[] = new int[n];
		
		int cx[] = new int[n];
		int cy[] = new int[n];
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			cx[i] = x[i];
			cy[i] = y[i];
			
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		long ans = Long.MAX_VALUE;

		for(int lx=0;lx<n;lx++){ for(int rx=lx+1;rx<n;rx++){
			for(int ly=0;ly<n;ly++){for(int ry=ly+1;ry<n;ry++){
				int x1 = x[lx], x2=x[rx];
				int y1 = y[ly], y2=y[ry];
				
				int cnt = 0;
				for(int i=0;i<n;i++){
					if(x1 <= cx[i] && cx[i] <= x2 && y1 <= cy[i] && cy[i] <= y2){
						cnt++;
					}
				}
				if(cnt >= k){
					ans = Math.min(ans, (long)(x2-x1) * (y2-y1));
				}
			}
			}
		}
		}
		System.out.println(ans);
	}

}
