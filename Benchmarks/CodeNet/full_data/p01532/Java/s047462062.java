import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int T = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		int[] h = new int[n];
		int[] t = new int[n];
		for(int i=0;i<n;i++){
			t[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		int sum = 0;
		int ans = -1;
		for(int p=0;;p++){
			if(t[p]==0 && h[p]==0){
				ans = p+1;
				break;
			}
			if(t[p]>0){
				if(T==L){
					ans = p+1;
					break;
				}
				sum += 10;
				if(sum<=90){
					t[p]--;
					T++;
				}
				if(sum>=90) sum = 0;
			}else{
				h[p]--;
				T -= (sum+10)/10;
				t[p] += (sum+10)/10;
				sum = 0;
			}
			if(T<0){
				ans = p+1;
				break;
			}

			if(p==n-1) p = -1;
		}
		System.out.println(ans);
	}
}