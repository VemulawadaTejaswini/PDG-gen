import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		int[] left = new int[m];
		int[] right = new int[m];
		int[] cnt = new int[n];
		for(int i = 0; i < m; i++) {
			left[i] = sc.nextInt();
			right[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1; i++) {
			if(s.substring(i, i+2).equals("AC")) {
				cnt[i] ++;
			}
		}
		for(int i = 0; i < m; i++) {
			int ans = 0;
			for(int j = left[i]-1; j < right[i]-1; j++) {
				ans += cnt[j];
			}
			
			System.out.println(ans);
		}
		sc.close();
	}
}
