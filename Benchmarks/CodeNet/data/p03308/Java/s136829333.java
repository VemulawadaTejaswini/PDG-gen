import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int[] array = new int [n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			sc.close();
			for(int i = 0;i<n;i++) {
				if(array[i]<=min) {
					min = array[i];
				}
				if(array[i]>=max) {
					max = array[i];
				}
			}
			System.out.println(max - min);
		}
	public static void main(String[] args) {
		solve();

	}

}
