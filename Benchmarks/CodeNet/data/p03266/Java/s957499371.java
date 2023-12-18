import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int i,kcnt = 0;
		int drec2 = 0;
		for(i = 1;i <= N;i++) {
			if(i % K == 0) kcnt++;
		}
		//System.out.println(_kcnt_);
		if(K % 2 == 0) {
			int k = K / 2;
			int cnt = 0;
			for(i = 1;i <= N;i++) {
				cnt = 0;
				if((i + k) % K == 0) drec2++;
			}
			
				System.out.println(drec2);
			
		}
	}
}