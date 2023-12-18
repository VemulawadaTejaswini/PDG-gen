import java.util.Scanner;
public class Main {
		 
		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int k = sc.nextInt();
			int res = 0;
			int array[] = new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				if(array[i] >=k) {
					res++;
				}
			}
			System.out.println(res);
			sc.close();
		}
	public static void main(String[] args) {
			solve();

	}

}
