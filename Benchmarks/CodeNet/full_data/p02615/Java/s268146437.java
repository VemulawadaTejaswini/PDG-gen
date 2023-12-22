import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] friendly = new Integer[n];
		int ans = 0;
		for(int a = 0; a < n; a ++) {
			friendly[a] = sc.nextInt();
		}
		Arrays.sort(friendly, Collections.reverseOrder());
		for(int b = 0; b < n - 1; b++) {
			ans += friendly[b];
		}
		System.out.println(ans);
    }
}