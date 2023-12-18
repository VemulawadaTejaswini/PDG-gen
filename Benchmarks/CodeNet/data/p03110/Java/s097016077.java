import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			double sum = 0;
			double array[] = new double[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextDouble();
				String u = sc.next();
				if(u.equals("BTC"))
					array[i]*=380000.0;
			}
			for(int i = 0;i<n;i++) {
				sum+=array[i];
			}
			System.out.println(sum);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
