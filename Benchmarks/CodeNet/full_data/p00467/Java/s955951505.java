import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			int[] list1 = new int[n];
			int[] list2 = new int[m];
			for(int i = 0; i < n; i++) {
				list1[i] = sc.nextInt();
			}
			for(int i = 0; i < m; i++) {
				list2[i] = sc.nextInt();
			}
			int now = 0;
			int i = 0;
			for(i = 0; i < m; i++) {
				now += list2[i];
				if(now >= n) {
					break;
				}
				now += list1[now];
				if(now == n-1) {
					break;
				}
			}
			System.out.println(i+1);
			
		}
		
		
		
		
	}
}