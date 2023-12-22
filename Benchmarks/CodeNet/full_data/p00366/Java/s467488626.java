import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> yakusu = new TreeSet<>();
		int n = sc.nextInt();
		int t[] = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		int max = t[n-1];
		
		for(int i = 1; i <= 10000; i++) {
			if(max % i==0) {
				yakusu.add(i);
			}
		}

		int ans = 0;
		for(int i = 0; i < n-1; i++) {
			ans += yakusu.ceiling(t[i])-t[i];
		}

		System.out.println(ans);
	}
}
