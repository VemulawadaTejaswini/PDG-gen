import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] x = new int[m];
			int[] y = new int[m];
			boolean[] a = new boolean[n];
			int[] num = new int [n];
			for(int i=0; i<m; i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			a[0] = true;
			num[0] = 1;
			for(int i=1; i<n; i++){
				a[i] = false;
				num[i] = 1;
			}
			
			for(int i=0; i<m; i++){
				num[x[i]-1]--;
				num[y[i]-1]++;
				if(a[x[i]-1]){
					a[y[i]-1] = true;
				}
				if(num[x[i]-1]==0){
					a[x[i]-1] = false;
				}
			}
			int ans = 0;
			for(int i=0; i<n; i++){
				if(a[i]){
					ans++;
				}
			}
			System.out.println(ans);
	}

}
