
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] t = new int[n];
		for(int i = 0;i < n;i++)t[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] sum = new int[m];
		int[] p = new int[m];
		int[] x = new int[m];
		for(int i = 0;i < m;i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		for(int i = 0;i < m;i++) {
			for(int k = 0;k < n;k++) {
				if(k == p[k])sum[k] += x[k];
				else sum[k] += t[k];
			}
			System.out.println(sum[i]);
		}
	}

}
