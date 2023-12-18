import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int res = 0;
			int[] array = new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				res+=array[i];
			}
			int max = array[0];
			for(int num :array) {
				if(max<=num) {
					max = num;
				}
			}
			System.out.println((res-max)+max/2);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}