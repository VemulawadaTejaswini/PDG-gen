import java.util.Scanner;
public class Main {
	
		static void solve() {
			Scanner sc =new Scanner(System.in);
			int n = sc.nextInt();
			int array[] = new int[n];
			int res = 0;
			for(int i = 0;i <n;i++) {
				array[i]=sc.nextInt();
			}
			for(int i = 1;i <n-1;i++) {
				if(array[i]<array[i-1]&&array[i]>array[i+1]||array[i]<array[i+1]&&array[i]>array[i-1]) {
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
