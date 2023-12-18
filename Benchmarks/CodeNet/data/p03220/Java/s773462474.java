import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int t = sc.nextInt();
			int a = sc.nextInt();
			int array[] = new int[n];
			int res = 0;
			int result = 0;
			int min = Integer.MAX_VALUE; 
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				if(a<t-array[i]*0.006) {	
					res = (int) ((t-array[i]*0.006)-a);
					if(res<=min) {
						result = i;
						min = res;
					}
			}
				else if(a>t-array[i]*0.006) {
					res = (int) (a-(t-array[i]*0.006));
					if(res<=min) {
						result = i;
						min = res;
					}
				}
			}
			System.out.println(result+1);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
