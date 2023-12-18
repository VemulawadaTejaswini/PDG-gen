import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			h[i]= sc.nextInt();
			
			if(i == 0) {
				ans++;
			} else {
				boolean flag = true;
				for(int j = 0; j < i; j++) {
					if(h[j] > h[i]) {
						flag = false;
					}
				}
				if(flag) {
					ans++;
				}
			}
		}

		String reString = "" + ans;
		System.out.println(reString);
	}
}