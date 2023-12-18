import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long[] arr = new long[n+1];
		arr[0] = 0;
		for(int i = 0; i < n; i++) {
			arr[i+1] = (long)scan.nextInt()+arr[i];
		}

		long ans = 0;

		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i]-arr[j]==0) ans++;
			}
		}

		System.out.println(ans);
	}
}
