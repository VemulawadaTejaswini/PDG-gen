import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
		if(r>b) {
			int tmp = r;
			r = b;
			b = tmp;
		}
		//r<=bの元、解いていく
		
		int le = 0, re = 0;
		
		
		//g<=199の時
		
		
		
		if(g<=199) {			
			r --;g--;b--;//自分のマスには自分を置けるので、移動するものは、各マーブルで１ずつ減らせる。
			int lg = g/2; //centerマーブルを左に持ってく
			int rg = g - lg; //centerマーブルを右に持ってく			
			int remL = 99 - lg, remR = 99 - rg;
			int rr = Math.min(r/2,remL);
			int lr = r - rr;
			int lb = Math.min(b/2,remR);
			int rb = b - lb;

			long ans = 0;
			ans += sum(lg);
			ans += sum(rg);
			ans += sum(lr);
			ans += sum(rr);
			ans += sum(lb);
			le = lr + 200;
			re = 1;
			for(int i=0;i<rb;i++) {
				if(re<=le+200) {
					ans += re;
					re++;
				}
				else {
					ans += le;
					le++;
				}
			}
			System.out.println(ans);
			return;
		}
		else {
			g--;//gのマーブルだけ、自分のマスには自分を置けるので１減らせる。
			int lg = g/2; //centerマーブルを左に持ってく
			int rg = g - lg; //centerマーブルを右に持ってく		
			int rr = lg - 100; //centerマーブルの一番左
			int lr = r + rr + 1;
			int lb = rg - 100; //centerマーブルの一番右
			int rb = b + lb + 1;
			
			long ans = 0;
			ans += sum(lg);
			ans += sum(rg);
			ans += sum(lr);
			ans -= sum(rr);
			ans -= sum(lb);
			le = lr + 200;
			re = rb;
			for(int i=0;i<rb;i++) {
				if(re<=le+200) {
					ans += re;
					re++;
				}
				else {
					ans += le;
					le++;
				}
			}
			System.out.println(ans);
			
		}
		
		
		
	}
	
	static long sum(long x) {
		long res = x * (x + 1) / 2;
		return res;
	}
	
}



