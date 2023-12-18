import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[200000];
		int b[] = new int[200000];
		int tmp[] = new int[200000];
		int ans = 0;

		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			b[i] = sc.nextInt();
			tmp[i] = b[i];
		}

		Boolean changed = true;
		int cnt = 0;

		while(changed){
			changed = false;
			if(b[0] > b[1] + b[n-1]){
					cnt = (tmp[0]-a[0]) / (b[1]+b[n-1]);
					tmp[0] -= (b[1]+b[n-1])*cnt;
					ans += cnt;
					if(cnt >= 1){
						changed = true;
					}
			}
			for(int i = 1 ; i < n-1 ; i++){
				if(b[i] > b[i+1] + b[i-1]){
						
						cnt = (tmp[i]-a[i]) / (b[i+1]+b[i-1]);
						tmp[i] -= (b[i+1]+b[i-1])*cnt;
						ans += cnt;
						if(cnt >= 1){
							changed = true;
						}
				}
			}
			if(b[n-1] > b[0] + b[n-2]){
					cnt = (tmp[n-1]-a[n-1]) / (b[0]+b[n-2]);
					tmp[n-1] -= (b[0]+b[n-2])*cnt;
					ans += cnt;
					if(cnt >= 1){
						changed = true;
					}
			}

			for(int i = 0 ; i < n ; i++){
				b[i] = tmp[i];
			}
		}

		for(int i = 0 ; i < n ; i++){
			if(a[i] != b[i]){
				ans = -1;
			}
		}

		System.out.println(ans);
	}

}