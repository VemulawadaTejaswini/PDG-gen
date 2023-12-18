import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int t = sc.nextInt();
			int a = sc.nextInt();
			double array[] = new double[n];
			int res = 0;
			double min = Integer.MIN_VALUE; 
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				if(t-array[i]*0.006>=min) {
					min = t-array[i]*0.006;
					res = i+1;
				}
			}
			System.out.println(res);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
