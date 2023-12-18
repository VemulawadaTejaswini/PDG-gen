import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		if (N<=1) {
			System.out.println(0);
			return;
		}
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[N - 1];
		
		int ans = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
			int part = 0;
			for (int j = 0; j < N; j++) {
				part += (int)Math.pow(arr[j]-i, 2);
			}
			if (part < ans) {
				ans = part;
			}
		}
		System.out.println(ans);
	}
}