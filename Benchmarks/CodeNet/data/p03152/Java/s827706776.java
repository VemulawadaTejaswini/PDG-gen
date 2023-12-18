import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] array = new int[n*m+1];
		boolean[] fixed = new boolean[n*m+1];
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		int[] b = new int[m];
		for(int j=0;j<m;j++) b[j] = in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i]==b[j]) fixed[a[i]] = true;
				else {
					array[Math.min(a[i], b[j])]++;
				}
			}
		}
		
		int mod = 1000000007;
		long ans = fixed[n*m]?1:0;
		array[n*m] = 1;
		for(int i=n*m-1;i>=1;i--) {
			if(fixed[i]) {
				array[i] += array[i+1];
				continue;
			}else if(array[i]>0) {
				ans = (ans * array[i]) % mod;
				array[i] += array[i+1];
				array[i]--;
			}else {
				array[i] += array[i+1];
				array[i]--;
				ans = (ans * array[i]) % mod;
			}
		}
		
		System.out.println(ans);
		in.close();
	}

}
