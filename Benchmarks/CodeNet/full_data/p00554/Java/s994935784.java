import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < M; i++) {
			if(a[i] >= N) count++;
		}
		int ans = 0;
		while(count < M-1) {
			int min = 2 << 29;
			int id = -1;
			int c = 0;
			for(int i = 0; i < M; i++) {
				if(a[i] >= N) c++;
				else if(a[i] + b[i] >= N) {
					if(N - a[i] < min) {
						min = N - a[i];
						id = i;
					}
				}
			}
			if(c >= M-1) break;
			ans += N - a[id];
			a[id] = N;
			
			
		}
		System.out.println(ans);
	}
}