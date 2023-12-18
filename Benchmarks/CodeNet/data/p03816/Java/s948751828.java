
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt[] = new int[100000+5];
		for(int i=0; i<n; i++) {
			cnt[sc.nextInt()]++;
		}
		int ans = n;
		int i=0;
		while(i<n) {
			if(cnt[i]>=3) {
				cnt[i] -= 2;
				ans -=2;
			}else if(cnt[i]==2) {
				int j=i+1;
				while(j<n) {
					if(cnt[j]>=1) {
						cnt[i]--;
						cnt[j]--;
						i=j;
						ans -= 2;
						break;
					}
					j++;
				}
			}
			i++;
		}
		System.out.println(ans);
		sc.close();
	}

}
