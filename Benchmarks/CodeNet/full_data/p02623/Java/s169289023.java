import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++){a[i]=scan.nextInt();}
		for(int i=0;i<m;i++){b[i]=scan.nextInt();}
		scan.close();
		int ans=0,cnt=0,a_cnt=0,b_cnt=0,end=0;
		while(true) {
			if(a[a_cnt]<b[b_cnt] ) {
				if(cnt+a[a_cnt] <= k) {
					cnt+=a[a_cnt];
					ans++;
				}else break;
				if(a_cnt==n-1) a[a_cnt]=Integer.MAX_VALUE;
				else a_cnt++;
			}else {
				if(cnt+b[b_cnt] <= k) {
					cnt+=b[b_cnt];
					ans++;
				}else break;
				if(b_cnt==m-1)b[b_cnt]=Integer.MAX_VALUE;
				else b_cnt++;
			}
			end++;
			if(end==m+n)break;
		}
		System.out.println(ans);
	}
}