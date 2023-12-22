import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] cnt = new int[n];
		int max = 0;
		int ans = -1;
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		for(int i=0;i<m;i++){
			int b = sc.nextInt();
			for(int j=0;j<n;j++){
				if(a[j]<=b){
					cnt[j]++;
					if(max<cnt[j]){
						max = cnt[j];
						ans = j+1;
					}
					break;	
				}
			}
		}
		System.out.println(ans);
	}

}