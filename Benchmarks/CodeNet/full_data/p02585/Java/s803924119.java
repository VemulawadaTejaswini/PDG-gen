import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		long result = Integer.MIN_VALUE;
		for(int i = 0; i < n; i ++) {
			long tmp = Integer.MIN_VALUE;
			long tmp_max =Integer.MIN_VALUE;
			int next = 0;
			for(int j = 0; j < k ; j++) {
				if(j == 0) {
					next = (p[i] -1);
					tmp = c[next];
				}
				else {
					next = (p[next] -1);
					tmp+=c[next];
				}
				if(tmp > tmp_max) {
					tmp_max = tmp;
				}
			}
			if(tmp_max > result) {
				result = tmp_max;
			}
		}
		System.out.println(result);
	}
}