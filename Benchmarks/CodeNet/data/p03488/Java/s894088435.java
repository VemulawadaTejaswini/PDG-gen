import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char s[] = sc.next().toCharArray();
		int x = sc.nextInt(), y = sc.nextInt();
		
		int dpx[] = new int[16010];
		int dpy[] = new int[16010];
		
		int cnt = 0;
		int p = 0;
		while(p<s.length && s[p] == 'F'){
			cnt++;
			p++;
		}
		dpx[cnt+8000] = 1;
		dpy[8000] = 1;
		
		cnt = 0;
		p++;
		int dir = 1;
		for(;p<s.length;p++){
			if(s[p]=='F')
				cnt++;
			else{
				if(dir==1)
					update(dpy, cnt);
				else
					update(dpx, cnt);
				
				cnt=0;
				dir = 1-dir;
			}
		}
		if(cnt!=0){
			if(dir==1)
				update(dpy, cnt);
			else
				update(dpx, cnt);
		}
		
		if(dpx[x+8000]==1 && dpy[y+8000]==1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	
	static void update(int dp[], int n){
		int arr[] = new int[dp.length];
		
		for(int i=0;i<arr.length;i++){
			if(dp[i] == 1){
				arr[i-n] = 1;
				arr[i+n] = 1;
			}
		}
		
		for(int i=0;i<dp.length;i++){
			dp[i] = arr[i];
		}
	}

}
