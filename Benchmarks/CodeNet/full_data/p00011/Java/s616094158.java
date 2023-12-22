import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			String[] num = s.split(",");
			a[i] = Integer.parseInt(num[0]);
			b[i] = Integer.parseInt(num[1]);
		}
		sc.close();
		int[] ans = new int[w];
		for(int i = 1; i <= w; i++) {
			int k = i;
			for(int j = 0; j < n; j++) {
				if(a[j] == k) {
					k = b[j];
				}else if(b[j] == k) {
					k = a[j];
				}
			}
			ans[k-1] = i;
		}
		for(int i : ans) {
			System.out.println(i);
		}
	}
}
