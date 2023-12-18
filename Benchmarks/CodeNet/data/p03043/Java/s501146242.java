import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		double ans = 0;
		if(n<k) {
			long count = 0;
			for(int i=1;i<=n;i++) {
				int tmp_count = 1;
				while((i<<tmp_count)<k) {
					tmp_count++;
				}
				count += 1<<(20-tmp_count);
			}
			ans = (double)count/(double)(1<<20)/n;
		}else {
			long count = 0;
			for(int i=1;i<=k-1;i++) {
				int tmp_count = 1;
				while((i<<tmp_count)<k) {
					tmp_count++;
				}
				count += 1<<(20-tmp_count);
			}
			double ans1 = (double)(n-k+1)/(double)n;
			double ans2 = (double)count/(double)(1<<20)/n;
			ans = ans1 + ans2;
		}
		System.out.println(ans);
		in.close();
	}

}
