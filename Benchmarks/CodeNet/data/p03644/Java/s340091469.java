import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();
		int cntmax = -1;
		int cnt, ii;
		int imax = 0;
		for(int i = 1; i <= n; i++) {
			cnt =0;
			ii =i;
			while(true) {
				if(ii%2==1)break;
				ii=ii/2;
				cnt++;
			}
//			System.out.println(""+i+":"+cnt);
			if(cnt > cntmax) {
				cntmax = cnt;
				imax = i;
			}
		}
		System.out.println(imax);
	}
}
